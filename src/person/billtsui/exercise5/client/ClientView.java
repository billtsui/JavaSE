package person.billtsui.exercise5.client;


import person.billtsui.exercise5.model.*;

import java.io.IOException;
import java.util.*;

/**
 * 编程实现客户端的主界面的绘制和相应功能的实现
 */
public class ClientView {
    /**
     * 为了可以使用输入输出流，采用合成复用原则实现
     */
    private ClientInitClose cic;

    /**
     * 已登录用户用户名
     */
    private String loginUsername;

    /**
     * 通过构造方法实现成员变量的初始化
     * @param cic
     */
    public ClientView( ClientInitClose cic) {
        this.cic = cic;
    }
    /**
     * 自定义成员方法实现客户端主界面的绘制
     */
    public void ClientMainPage() throws IOException, ClassNotFoundException {

        while (true) {
            System.out.println("\n\n\t\t   在线考试系统");
            System.out.println("----------------------------------");
            System.out.print("   [1] 学员系统");
            System.out.println("    [2] 管理员系统");
            System.out.println("   [0]退出系统");
            System.out.println("----------------------------------");
            System.out.println("请选择要进行的业务编号：");

            int choose = ClientScanner.getSc().nextInt();
            switch (choose) {
                case 1: clientUserLogin();;break;
                case 2: clientManagerLogin();break;
                case 0: System.out.println("正在退出系统...");return;
                default: System.out.println("输入错误，请重新选择！");
            }
        }
    }

    /**
     * 自定义成员方法实现客户端管理员登陆的功能
     */
    private void clientManagerLogin() throws IOException, ClassNotFoundException {
        //1.准备管理员登录的相关信息
        System.out.println("请输入管理员的账户信息:");
        String username = ClientScanner.getSc().next();
        System.out.println("请输入管理员的密码信息:");
        String password = ClientScanner.getSc().next();
        UserMessage tum = new UserMessage("managerCheck",new User(username,password));
        //2.将usermessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        //3.接收服务器端的处理结果并输出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())){
            System.out.println("登陆成功，欢迎使用!");
            clientManagePage();
        }else {
            System.out.println("用户名或密码错误");
        }
    }



    /**
     * 自定义成员方法实现管理员系统界面的绘制
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void clientManagePage() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("  \t\t\t  管理员系统");
            System.out.println("----------------------------------------");
            System.out.print("  [1] 学员管理模块");
            System.out.println("  \t[2] 考题管理模块");
            System.out.println("  [0]退出管理员系统并返回上一级");
            System.out.println("----------------------------------------");
            System.out.println("请选择要进行的业务编号：");

            int choose = ClientScanner.getSc().nextInt();
            switch (choose) {
                case 1: clientUserManagePage();break;
                case 2: clientQuestionManagePage();break;
                case 0: System.out.println("正在退出系统...");return;
                default: System.out.println("输入错误，请重新选择！");
            }
        }
    }

    /**
     * 自定义成员方法实现客户端学员系统界面的绘制
     */
    private void clientUserPage() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("  \t\t\t 学员系统");
            System.out.println("------------------------------");
            System.out.print("   [1] 用户模块");
            System.out.println("    [2] 考试模块");
            System.out.println("   [0]退出学员系统并返回上一级");
            System.out.println("------------------------------");
            System.out.println("请选择要进行的业务编号：");

            int choose = ClientScanner.getSc().nextInt();
            switch (choose) {
                case 1: clientUserSystemPage();break;
                case 2: clientExamPage();break;
                case 0: System.out.println("正在退出系统...");return;
                default: System.out.println("输入错误，请重新选择！");
            }
        }
    }

    /**
     * 自定义成员方法实现用户模块界面的绘制
     */
    private void clientUserSystemPage() throws IOException, ClassNotFoundException {
        System.out.println("  \t\t\t\t\t用户模块");
        System.out.println("--------------------------------------------");
        System.out.print("   [1] 修改密码");
        System.out.println("   [0]退出用户模块并返回上一级");
        System.out.println("--------------------------------------------");
        System.out.println("请选择要进行的业务编号：");

        int choose = ClientScanner.getSc().nextInt();
        switch (choose) {
            case 1:clientResetPassword();break;
            case 0:System.out.println("正在退出系统...");return;
            default:System.out.println("输入错误，请重新选择！");
        }
        
    }

    /**
     * 自定义成员方法实现客户端学员登陆的功能
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void clientUserLogin() throws IOException, ClassNotFoundException {
        //1.准备学员登录的相关信息
        System.out.println("请输入学员的账户信息:");
        String username = ClientScanner.getSc().next();
        System.out.println("请输入学员的密码信息:");
        String password = ClientScanner.getSc().next();
        UserMessage tum = new UserMessage("userCheck",new User(username,password));
        //2.将UserMessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        //3.接收服务器端的处理结果并输出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())){
            System.out.println("登陆成功，欢迎使用!");
            loginUsername = username;
            clientUserPage();
        }else {
            System.out.println("用户名或密码错误");

        }
    }

    /**
     * 自定义成员方法实现更改密码的功能
     */
    private void clientResetPassword() throws IOException, ClassNotFoundException {
        //1.准备学员修改密码的相关信息
        System.out.println("请输入您的新密码:");
        String password = ClientScanner.getSc().next();
        UserMessage tum = new UserMessage("userResetPassword",new User(loginUsername,password));
        //2.将UserMessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        //3.接收服务器端的处理结果并输出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())){
            System.out.println("密码修改成功");
        }else {
            System.out.println("密码修改失败");
        }
    }

    /**
     * 自定义成员方法实现考试模块界面的绘制
     */
    private void clientExamPage() throws IOException, ClassNotFoundException {

        while (true) {
            System.out.println("  \t\t\t  考试模块");
            System.out.println("-----------------------------------");
            System.out.print("   [1] 开始考试");
            System.out.println("  \t[2] 查询成绩");
            System.out.println("   [0]退出考试模块并返回上一级");
            System.out.println("-----------------------------------");
            System.out.println("请选择要进行的业务编号：");

            int choose = ClientScanner.getSc().nextInt();
            switch (choose) {
                case 1: clientUserTest();break;
                case 2: clientFindScore();break;
                case 0: System.out.println("正在退出系统...");return;
                default: System.out.println("输入错误，请重新选择！");
            }
        }
    }

    /**
     * 自定义成员方法实现开始考试的功能
     */
    private void clientUserTest() throws IOException, ClassNotFoundException {
        List<UserQuestionScore> userQuestionScoreList = new LinkedList<>();
        userQuestionScoreList.add(new UserQuestionScore(loginUsername));
        UserQuestionScoreMessage uqsm = new UserQuestionScoreMessage("userShowQuestion",userQuestionScoreList);
        //2.将UserMessage类型的对象通过对象输出流发送给服务器用以获取考题列表
        cic.getOos().writeObject(uqsm);
        //3.接收服务器端发送过来的考题列表并输出展示
        List<Question> questionList = (List<Question>) cic.getOis().readObject();
        List<UserQuestionScore> userQuestionScores = new LinkedList<>();
        int total = 0;
        UserQuestionScore userQuestionScore = null;
        for (Question question : questionList) {
            System.out.println(question.getQuestionId() + "." + question.getTopic());
            Set<Character> characterSet = question.getAnswer().keySet();
            for (Character answerId : characterSet) {
                System.out.println(answerId + " " + question.getAnswer().get(answerId));
            }
            System.out.println("请输入您的选择");
            String choose = ClientScanner.getSc().next();
            if (question.getCorrectAnswer().equals(choose)){
                userQuestionScore = new UserQuestionScore(loginUsername, question, question.getScore());
            }else {
                userQuestionScore = new UserQuestionScore(loginUsername, question, 0);
            }
            userQuestionScores.add(userQuestionScore);
            total += question.getScore();
        }
        //4.将UserQuestionScoreMessage类型的考试成绩通过对象输出流发送给服务器
        uqsm = new UserQuestionScoreMessage("userAddScore",userQuestionScores);
        cic.getOos().writeObject(uqsm);
        //3.接收服务器端的处理结果并输出提示
        uqsm = (UserQuestionScoreMessage) cic.getOis().readObject();
        if ("success".equals(uqsm.getType())){
            System.out.println("成绩已保存");
        }else {
            System.out.println("成绩保存失败");
        }
    }

    /**
     * 自定义成员方法实现查询分数的功能
     */
    private void clientFindScore() throws IOException, ClassNotFoundException {
        List<UserQuestionScore> userQuestionScores = new LinkedList<>();
        userQuestionScores.add(new UserQuestionScore(loginUsername));
        UserQuestionScoreMessage uqsm = new UserQuestionScoreMessage("userGetScore",userQuestionScores);
        cic.getOos().writeObject(uqsm);
        //3.接收服务器端的处理结果并输出提示
        uqsm = (UserQuestionScoreMessage) cic.getOis().readObject();

        if ("success".equals(uqsm.getType())){
            int total = 0;
            int myTotal = 0;
            System.out.println("您的考试成绩如下:");
            for (UserQuestionScore uqs : uqsm.getUserQuestionScores()) {
                Question question = uqs.getQuestion();

                System.out.println(question.getQuestionId() + "." + question.getTopic() );
                Set<Character> characters = question.getAnswer().keySet();
                for (Character c : characters) {
                    System.out.println(c + " " + question.getAnswer().get(c));
                }
                System.out.println("正确答案是:" + question.getCorrectAnswer());
                System.out.println("您的分数:" + uqs.getScore() + "/" + question.getScore());
                total += question.getScore();
                myTotal += uqs.getScore();
            }
            System.out.println("您获得总分是:" + myTotal + "/" + total);

        }else {
            System.out.println("成绩获取失败");
        }
    }

    /**
     * 自定义成员方法实现学生管理模块界面的绘制
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void clientUserManagePage() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("--------------------------------学员管理模块----------------------------");
            System.out.println("1.添加学员 2.修改学员 3.删除学员 4.查询学员 0.退出学员管理模块并返回上一级");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("请选择您要执行的操作(输入1到4)：");

            int choose = ClientScanner.getSc().nextInt();
            switch (choose) {
                case 1:clientUserAdd();break;
                case 2:clientUserUpdate();break;
                case 3:clientUserDelete();break;
                case 4:clientUserFind();break;
                case 0:System.out.println("正在退出系统...");return;
                default: System.out.println("输入错误，请重新选择！");
            }
        }
    }

    /**
     * 自定义成员方法实现学员的添加
     */
    private void clientUserAdd() throws IOException, ClassNotFoundException {
        //1.准备学员的相关信息
        System.out.println("请输入要添加学员的账号信息:");
        String username = ClientScanner.getSc().next();
        System.out.println("请输入添加学员的密码信息:");
        String password = ClientScanner.getSc().next();
        UserMessage tum = new UserMessage("userAdd",new User(username,password));
        //2.将usermessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        //3.接收服务器端的处理结果并输出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())){
            System.out.println("添加成功，欢迎使用!");
        }else {
            System.out.println("用户已存在");
        }
    }

    private void clientUserUpdate() throws IOException, ClassNotFoundException {
        //1.准备需要修改的学生信息
        System.out.println("请输入修改前学员的账号信息:");
        String oldUsername = ClientScanner.getSc().next();
        System.out.println("请输入修改后学员的账号信息:");
        String newUsername = ClientScanner.getSc().next();
        System.out.println("请输入修改后学员的密码信息:");
        String newPassword = ClientScanner.getSc().next();
        String username = oldUsername + "," + newUsername;

        UserMessage tum = new UserMessage("userUpdate",new User(username,newPassword));

        //2.将UserMessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        //3.接收服务器端的处理结果并输出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())){
            System.out.println("用户信息修改成功,修改后的用户信息是:" + tum.getUser());
        }else {
            System.out.println("学员不存在");
        }
    }

    private void clientUserFind() throws IOException, ClassNotFoundException {
        //1.准备学员的相关信息
        System.out.println("请输入要查找学员的账号信息:");
        String username = ClientScanner.getSc().next();
        UserMessage tum = new UserMessage("userFind",new User(username));
        //2.将UserMessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        //3.接收服务器端的处理结果并输出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())){
            System.out.println("您要查找的学员信息是:" + tum.getUser());
        }else {
            System.out.println("学员不存在");
        }
    }

    private void clientUserDelete() throws IOException, ClassNotFoundException {
        //1.准备学员的相关信息
        System.out.println("请输入要删除学员的账号信息:");
        String username = ClientScanner.getSc().next();
        UserMessage tum = new UserMessage("userDelete",new User(username));
        //2.将usermessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        //3.接收服务器端的处理结果并输出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())){
            System.out.println("删除学员成功!");
        }else {
            System.out.println("学员不存在");
        }
    }





    /**
     * 自定义成员方法实现考题管理模块界面的绘制
     */
    private void clientQuestionManagePage() throws IOException, ClassNotFoundException {


        while (true) {
            System.out.println("------------------------------考题管理模块-------------------------------");
            System.out.println("1.增加考题 2.删除考题 3.修改考题 4.查询考题 0.退出考题管理模块并返回上一级");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("请选择您要执行的操作(请输入0到4)：");

            int choose = ClientScanner.getSc().nextInt();
            switch (choose) {
                case 1: clientQuestionAdd();break;
                case 2: clientQuestionDelete();break;
                case 3: clientQuestionUpdate();break;
                case 4: clientQuestionFind();break;
                case 0:System.out.println("正在退出系统...");return;
                default: System.out.println("输入错误，请重新选择！");
            }
        }
    }

    /**
     * 自定义成员方法实现考题的添加
     */
    private void clientQuestionAdd() throws IOException, ClassNotFoundException {
        //1.准备考试的相关信息
        System.out.println("请输入考题编号(请输入1-N)");
        int questionId = ClientScanner.getSc().nextInt();
        System.out.println("请输入要添加的考试题目");
        String topic = ClientScanner.getSc().next();

        System.out.println("考题的答案数量是(请输入1-N)");
        int num = ClientScanner.getSc().nextInt();

        Map<Character, String> answer = new HashMap<>();
        for (int i = 0; i < num; i++) {
            char c1 = (char) (65 + i);
            System.out.println("请输入考题的答案");
            answer.put(c1,ClientScanner.getSc().next());

        }
        System.out.println("请输入正确答案的编号");
        String correctAnswer = ClientScanner.getSc().next();
        System.out.println("请输入考题分数");
        int score = ClientScanner.getSc().nextInt();
        QuestionMessage tqm =new QuestionMessage("questionAdd", new Question(questionId, topic, answer, correctAnswer,score));
        //2.将Question类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tqm);
        //3.接收服务器端的处理结果并输出提示

        Object o = cic.getOis().readObject();
        if (o instanceof QuestionMessage)
        {
            tqm = (QuestionMessage) o;
            if ("success".equals(tqm.getType())){
                System.out.println("添加问题成功!");
            }else {
                System.out.println("问题已存在");
            }
        }
    }

    /**
     * 自定义成员方法实现考题的删除
     */
    private void clientQuestionDelete() throws IOException, ClassNotFoundException {
        //1.准备学员的相关信息
        QuestionMessage tqm = null;
        System.out.println("请输入要删除考题的编号或考试题目:");
        String string = ClientScanner.getSc().next();
        if (string.matches("\\d+")){
            tqm = new QuestionMessage("questionDelete",new Question(Integer.parseInt(string)));
        }else {
            tqm = new QuestionMessage("questionDelete",new Question(string));
        }
        if (null != tqm) {
            //2.将usermessage类型的对象通过对象输出流发送给服务器
            cic.getOos().writeObject(tqm);
            //3.接收服务器端的处理结果并输出提示
            tqm = (QuestionMessage) cic.getOis().readObject();

            if ("success".equals(tqm.getType())) {
                System.out.println("删除考题成功!");
            } else {
                System.out.println("考题不存在");
            }
        }
    }

    /**
     * 自定义成员方法实现考题的修改
     */
    private void clientQuestionUpdate() throws IOException, ClassNotFoundException {
        //1.准备考题的相关信息
        System.out.println("请输入想要修改的标题:");
        String topic = ClientScanner.getSc().next();
        //QuestionMessage tqm = new QuestionMessage("questionFind",new Question(topic));
        //2.将QuestionMessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(new QuestionMessage("questionFind",new Question(topic)));
        //3.接收服务器端的处理结果并输出提示
        List<Question> findQuestionList = (List<Question>) cic.getOis().readObject();
        if (!findQuestionList.isEmpty()){
            System.out.println("查找到的问题有:");
            for (Question question : findQuestionList) {
                System.out.println(question);
            }
            System.out.println("请选择您要修改的问题编号:");
            int questionId = ClientScanner.getSc().nextInt();
            System.out.println("请输入要修改的标题");
            topic = ClientScanner.getSc().next();

            System.out.println("请输入要修改考题的答案数量是(请输入1-N)");
            int num = ClientScanner.getSc().nextInt();

            Map<Character, String> answer = new HashMap<>();
            for (int i = 0; i < num; i++) {
                char c1 = (char) (65 + i);
                System.out.println("请输入要修改的考题答案");
                answer.put(c1,ClientScanner.getSc().next());
            }
            System.out.println("请输入要修改正确答案的编号,A~Z");
            String correctAnswer = ClientScanner.getSc().next();
            System.out.println("请输入要修改的考题分数");
            int score = ClientScanner.getSc().nextInt();
            QuestionMessage tqm =new QuestionMessage("questionUpdate", new Question(questionId, topic, answer, correctAnswer,score));
            //2.将Question类型的对象通过对象输出流发送给服务器
            cic.getOos().writeObject(tqm);
            //3.接收服务器端的处理结果并输出提示
            tqm = (QuestionMessage) cic.getOis().readObject();

            if ("success".equals(tqm.getType())) {
                System.out.println("修改考题成功!");
            } else {
                System.out.println("修改失败");
            }
        }else {
            System.out.println("问题不存在");
        }
    }

    /**
     * 自定义成员方法实现考题的查找
     */
    private void clientQuestionFind() throws IOException, ClassNotFoundException {
        //1.准备考题的相关信息
        System.out.println("请输入要查找的标题:");
        String topic = ClientScanner.getSc().next();
        QuestionMessage tqm = new QuestionMessage("questionFind",new Question(topic));
        //2.将QuestionMessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tqm);
        //3.接收服务器端的处理结果并输出提示
        List<Question> findQuestionList = (List<Question>) cic.getOis().readObject();
        if (!findQuestionList.isEmpty()){
            System.out.println("查找到的问题有:");
            for (Question question : findQuestionList) {
                System.out.println(question);
            }
        }else {
            System.out.println("问题不存在");
        }
    }


}
