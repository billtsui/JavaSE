package person.billtsui.exercise5.model;

import java.io.Serializable;

public class UserQuestionScore  implements Serializable {
    private static final long serialVersionUID = -7171881171393401045L;
    private String username;
    private Question question;
    private int score;

    public UserQuestionScore() {
    }

    public UserQuestionScore(String username, Question question, int score) {
        this.username = username;
        this.question = question;
        this.score = score;
    }

    public UserQuestionScore(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "UserQuestionScore{" +
                "username='" + username + '\'' +
                ", question=" + question +
                ", score=" + score +
                '}';
    }
}
