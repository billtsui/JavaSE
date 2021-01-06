package person.billtsui.exercise5.server;

import person.billtsui.exercise5.model.*;

import java.io.IOException;
import java.util.List;

/**
 * 编程实现服务器的主功能
 */
public class ServerView {

    /**
     * 使用合成复用原则
     */
    private ServerInitClose sic;
    private ServerDao sd;
    public ServerView(ServerInitClose sic, ServerDao sd) {
        this.sic = sic;
        this.sd = sd;
    }

    /**
     * 自定义成员方法实现客户端发来消息的接收和处理
     */
    public void serverReceive() throws IOException, ClassNotFoundException {
        Object o = sic.getOis().readObject();
        if (o instanceof UserMessage)
        {
            UserMessage tum = (UserMessage) o;
            System.out.println("接收到的对象是：" + tum);

            switch (tum.getType()) {
                case "managerCheck":tum = serverManagerCheck(tum);break;
                case "userCheck":tum = serverUserCheck(tum);break;
                case "userAdd":tum = serverUserAdd(tum);break;
                case "userUpdate":tum = serverUserUpdate(tum);break;
                case "userDelete":tum = serverUserDelete(tum);break;
                case "userFind":tum = serverUserFind(tum);break;
                case "userResetPassword":tum = serverUserResetPassword(tum);break;

                default:
            }
            //将校验结果发送给客户端
            sic.getOos().writeObject(tum);
            System.out.println("服务器发送校验结果成功");
        }else if (o instanceof QuestionMessage)
        {
            QuestionMessage tqm = (QuestionMessage) o;

            switch (tqm.getType()) {
                case "questionAdd":tqm = serverQuestionAdd(tqm);break;
                case "questionDelete":tqm = serverQuestionDelete(tqm);break;
                case "questionUpdate":tqm = serverQuestionUpdate(tqm);break;
                case "questionFind": List<Question> findQuestionList = serverQuestionFind(tqm);sic.getOos().flush();sic.getOos().writeObject(findQuestionList);System.out.println("服务器发送处理结果成功");break;
                default:
            }
            //将校验结果发送给客户端

            sic.getOos().flush();
            System.out.println(tqm);
            if (!"questionFind".equals(tqm.getType())) {
                sic.getOos().writeObject(tqm);
            }
            System.out.println("服务器发送处理结果成功");
        }else if(o instanceof UserQuestionScoreMessage){

            UserQuestionScoreMessage uqsm = (UserQuestionScoreMessage) o;
            switch (uqsm.getType()) {
                case "userShowQuestion":sic.getOos().flush();sic.getOos().writeObject(sic.getQuestionList()); return;
                case "userAddScore":uqsm = serverUserAddScore(uqsm);break;
                case "userGetScore":uqsm = serverUserGetScore(uqsm);break;
                default:
            }

            //将校验结果发送给客户端
            sic.getOos().writeObject(uqsm);
        }

    }


    private UserMessage serverManagerCheck(UserMessage tum) {
        //调用方法实现管理员账号和密码信息的校验
        if (sd.serverManageCheck(tum.getUser())) {
            tum.setType("success");
        } else {
            tum.setType("fail");
        }
        return tum;
    }

    private UserMessage serverUserCheck(UserMessage tum) {

        //调用方法实现学员账号和密码信息的校验
        if (sd.serverUserCheck(tum.getUser())) {
            tum.setType("success");
        } else {
            tum.setType("fail");
        }
        return tum;
    }

    private UserMessage serverUserAdd(UserMessage tum) {
        if (sd.serverUserAdd(tum.getUser())) {
            tum.setType("success");
        } else {
            tum.setType("fail");
        }
        return tum;
    }

    private UserMessage serverUserUpdate(UserMessage tum) {

        int pos = sd.serverUserUpdate(tum.getUser());
        if (pos >= 0){
            tum.setType("success");
            tum.setUser(sic.getUserList().get(pos));
        }else {
            tum.setType("fail");
        }
        return tum;
    }

    private UserMessage serverUserDelete(UserMessage tum) {
        if (sd.serverUserDelete(tum.getUser())) {
            tum.setType("success");
        } else {
            tum.setType("fail");
        }
        return tum;
    }

    private UserMessage serverUserFind(UserMessage tum) {
        int pos = sd.serverUserFind(tum.getUser());
        if (pos >= 0){
            tum.setType("success");
            tum.setUser(sic.getUserList().get(pos));
        }else {
            tum.setType("fail");
        }
        return tum;
    }

    private UserMessage serverUserResetPassword(UserMessage tum) {
        if (sd.serverUserResetPassword(tum.getUser())) {
            tum.setType("success");
        } else {
            tum.setType("fail");
        }
        return tum;
    }


    private QuestionMessage serverQuestionAdd(QuestionMessage tqm) {
        if (sd.serverQuestionAdd(tqm.getQuestion())) {
            tqm.setType("success");
        } else {
            tqm.setType("fail");
        }
        return tqm;
    }

    /**
     * 自定义成员方法实现考题的删除
     * @param tqm
     * @return
     */
    private QuestionMessage serverQuestionDelete(QuestionMessage tqm) {
        if (sd.serverQuestionDelete(tqm.getQuestion())) {
            tqm.setType("success");
        } else {
            tqm.setType("fail");
        }
        return tqm;
    }

    private QuestionMessage serverQuestionUpdate(QuestionMessage tqm) {
        if (sd.serverQuestionUpdate(tqm.getQuestion())) {
            tqm.setType("success");
        } else {
            tqm.setType("fail");
        }

        return tqm;
    }


    private List<Question> serverQuestionFind(QuestionMessage tqm) {
        return sd.serverQuestionFind(tqm.getQuestion());
    }

    private UserQuestionScoreMessage serverUserAddScore(UserQuestionScoreMessage uqsm) {
        if (sd.serverUserAddScore(uqsm.getUserQuestionScores())) {
            uqsm.setType("success");
        } else {
            uqsm.setType("fail");
        }

        return uqsm;
    }


    private UserQuestionScoreMessage serverUserGetScore(UserQuestionScoreMessage uqsm) {
        if (!sd.serverUserGetScore(uqsm.getUserQuestionScores()).isEmpty()) {
            uqsm.setType("success");
            uqsm.setUserQuestionScores(sd.serverUserGetScore(uqsm.getUserQuestionScores()));
        } else {
            uqsm.setType("fail");
        }

        return uqsm;
    }

}
