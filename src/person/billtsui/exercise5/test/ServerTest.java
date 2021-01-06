package person.billtsui.exercise5.test;


import person.billtsui.exercise5.server.*;

import java.io.IOException;

public class ServerTest {

    public static void main(String[] args) {

        ServerInitClose sic = null;

        try {
            //1.声明ServerInitClose类型的引用指向该类型的对象
            sic = new ServerInitClose();

            //2.调用成员方法实现服务器的初始化操作
            sic.serverInit();
            //4.声明ServerDao类型的引用指向ServerDao类型的对象
            ServerDao sd = new ServerDao(sic.getUserList(), sic.getQuestionList(), sic.getUserQuestionScoreList());
            while (true) {

                //3.声明ServerView类型的引用指向Server类型的对象
                ServerView sv = new ServerView(sic, sd);
                sv.serverReceive();
            }
        } catch (IOException | ClassNotFoundException e) {
            if (!"java.io.EOFException".equals(e.toString())) {
                e.printStackTrace();
            }
        } finally {
            //3.调用成员方法实现关闭操作
            if (sic != null) {
                try {
                    sic.serverClose();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
