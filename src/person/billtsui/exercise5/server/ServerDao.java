package person.billtsui.exercise5.server;


import person.billtsui.exercise5.model.*;

import java.util.LinkedList;
import java.util.List;


/**
 * 编程实现数据的存取
 */
public class ServerDao {
    private List<User> userList = new LinkedList<>();
    private List<Question> questionList = new LinkedList<>();
    private List<UserQuestionScore> userQuestionScoreList = new LinkedList<>();

    public ServerDao(List<User> userList, List<Question> questionList, List<UserQuestionScore> userQuestionScoreList) {
        this.userList = userList;
        this.questionList = questionList;
        this.userQuestionScoreList = userQuestionScoreList;
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

    public boolean serverManageCheck(User user) {
        if ("admin".equals(user.getName()) && "123456".equals(user.getPassword())){
            return true;
        }

        return false;
    }

    public boolean serverUserCheck(User user) {
        for (User user1 : userList) {
            if (user1.getName().equals(user.getName()) && user1.getPassword().equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }

    /**
     * 自定义成员方法实现用户的添加
     * @param user
     * @return
     */
    public boolean serverUserAdd(User user) {
        if (!userList.contains(user) || userList.isEmpty()){
            userList.add(user);
            return true;
        }
        return false;
    }

    /**
     * 自定义成员方法实现用户的删除
     * @param user
     * @return
     */
    public boolean serverUserDelete(User user) {
        for (User user1 : userList) {
            if (user1.getName().equals(user.getName())){
                userList.remove(user1);
                return true;
            }
        }
        return false;

    }

    /**
     * 自定义成员方法实现用户的修改
     * @param user
     * @return
     */
    public int serverUserUpdate(User user) {
        int pos = user.getName().indexOf(",");
        String oldUsername = user.getName().substring(0,pos);
        String newUsername = user.getName().substring(pos+1);
        String newPassword = user.getPassword();

        for (User user1 : userList) {
            if (user1.getName().equals(oldUsername)){
                pos = userList.indexOf(user1);
                userList.set(pos,new User(newUsername, newPassword));
                return pos;
            }
        }
        return -1;
    }

    /**
     * 自定义成员方法实现用户的查找
     * @param user
     * @return
     */
    public int serverUserFind(User user) {
        for (User user1 : userList) {
            if (user1.getName().equals(user.getName())){
                return userList.indexOf(user1);
            }
        }
        return -1;
    }

    public boolean serverUserResetPassword(User user) {
        for (User user1 : userList) {
            if (user1.getName().equals(user.getName())){
                int pos = userList.indexOf(user1);
                userList.set(pos,user);
                return true;
            }
        }
        return false;
    }

    public boolean serverQuestionAdd(Question question) {
        boolean flag = true;
        for (Question question1 : questionList) {
            if (question1.getQuestionId() == question.getQuestionId() || question1.getTopic().equals(question.getTopic())){
                return false;
            }
        }

        if (questionList.isEmpty() || flag){
            questionList.add(question);
            return true;
        }
        return false;
    }

    public boolean serverQuestionDelete(Question question) {
        for (Question question1 : questionList) {
            if (question1.getTopic().equals(question.getTopic()) || question1.getQuestionId() == question.getQuestionId()){
                questionList.remove(question1);
                return true;
            }
        }
        return false;
    }

    public boolean serverQuestionUpdate(Question question) {
        for (Question question1 : questionList) {
            if (question1.getQuestionId() == question.getQuestionId()){
                int pos = questionList.indexOf(question1);

                questionList.set(pos,question);
                return true;
            }
        }
        return false;
    }

    public List<Question> serverQuestionFind(Question question) {
        List<Question> findQuestionList = new LinkedList<>();
        for (Question question1 : questionList) {
            if (question1.getTopic().contains(question.getTopic())){
                findQuestionList.add(question1);
            }
        }
        return findQuestionList;
    }


    public boolean serverUserAddScore(List<UserQuestionScore> userQuestionScores) {
        return userQuestionScoreList.addAll(userQuestionScores);
    }

    public List<UserQuestionScore> serverUserGetScore(List<UserQuestionScore> userQuestionScores) {
        List<UserQuestionScore> getUserQuestionScoreList = new LinkedList<>();
        for (UserQuestionScore userQuestionScore : userQuestionScoreList) {
            if (userQuestionScore.getUsername().equals(userQuestionScores.get(0).getUsername())){
                getUserQuestionScoreList.add(userQuestionScore);
            }
        }
        return getUserQuestionScoreList;
    }
}
