package person.billtsui.exercise5.server;


import person.billtsui.exercise5.model.Question;
import person.billtsui.exercise5.model.User;
import person.billtsui.exercise5.model.UserQuestionScore;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

/**
 * 编程实现服务器的初始化和关闭
 */
public class ServerInitClose {

    /**
     * 自定义成员变量来记录Socket和流对象
     */
    private static ServerSocket ss;
    private Socket s;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private List<User> userList = null;
    private List<Question> questionList = null;
    private List<UserQuestionScore> userQuestionScoreList = null;

    {
        //5.使用对象输入流获取用户列表
        userList = new LinkedList<>();
        questionList = new LinkedList<>();
        userQuestionScoreList = new LinkedList<>();
        try {
            File file = new File("/Users/billtsui/ExamServerUserList.txt");
            if (file.exists())
            {
                ois = new ObjectInputStream(new FileInputStream("/Users/billtsui/ExamServerUserList.txt"));
                userList = (List<User>) ois.readObject();
                System.out.println("读取到的学生列表是:：" + userList);
            }
            file = new File("/Users/billtsui/ExamServerQuestionList.txt");
            if (file.exists())
            {
                ois = new ObjectInputStream(new FileInputStream("/Users/billtsui/ExamServerQuestionList.txt"));
                questionList = (List<Question>) ois.readObject();
                System.out.println("---------------------------------------");
                System.out.println("获取到的问题列表是：" + questionList);
            }
            file = new File("/Users/billtsui/ExamServerUserQuestionScoreList.txt");
            if (file.exists())
            {
                ois = new ObjectInputStream(new FileInputStream("/Users/billtsui/ExamServerUserQuestionScoreList.txt"));
                userQuestionScoreList = (List<UserQuestionScore>) ois.readObject();
                System.out.println("--------------------------");
                System.out.println("获取到的学生成绩是：" + userQuestionScoreList);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ObjectInputStream getOis() {

        return ois;
    }

    public ObjectOutputStream getOos() {

        return oos;
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public List<UserQuestionScore> getUserQuestionScoreList() {
        return userQuestionScoreList;
    }

    /**
     * 自定义成员方法实现服务器的初始化操作
     */
    public void serverInit() throws IOException, ClassNotFoundException {
        //1.创建serverSocket类型的对象并提供端口号
        ss = new ServerSocket(8888);

        //2.等待客户端的请求，调用accept方法
        System.out.println("等待客户端的连接请求...");
        s = ss.accept();
        System.out.println("客户端连接成功");
        //3.使用输入输出流进行通信
        ois = new ObjectInputStream(s.getInputStream());
        oos = new ObjectOutputStream(s.getOutputStream());
        System.out.println("服务器初始化成功");
        //4.关闭socket并释放相关资源
    }

    /**
     * 自定义成员方法实现服务器的关闭操作
     */
    public void serverClose() throws IOException {
        oos = new ObjectOutputStream(new FileOutputStream("/Users/billtsui/ExamServerUserList.txt"));
        oos.writeObject(userList);
        System.out.println("学员信息保存成功");
        oos = new ObjectOutputStream(new FileOutputStream("/Users/billtsui/ExamServerQuestionList.txt"));
        oos.writeObject(questionList);
        System.out.println("考题信息保存成功");
        oos = new ObjectOutputStream(new FileOutputStream("/Users/billtsui/ExamServerUserQuestionScoreList.txt"));
        oos.writeObject(userQuestionScoreList);
        System.out.println("学生成绩保存成功");
        oos.close();
        ois.close();
        s.close();
        ss.close();
        System.out.println("服务器成功关闭");
    }

}
