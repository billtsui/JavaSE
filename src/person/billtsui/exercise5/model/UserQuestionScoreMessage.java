package person.billtsui.exercise5.model;

import java.io.Serializable;
import java.util.List;

public class UserQuestionScoreMessage implements Serializable {

    private static final long serialVersionUID = 4039196311749467308L;
    private String type;
    private List<UserQuestionScore> userQuestionScores;

    public UserQuestionScoreMessage() {
    }

    public UserQuestionScoreMessage(String type, List<UserQuestionScore> userQuestionScores) {
        this.type = type;
        this.userQuestionScores = userQuestionScores;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<UserQuestionScore> getUserQuestionScores() {
        return userQuestionScores;
    }

    public void setUserQuestionScores(List<UserQuestionScore> userQuestionScores) {
        this.userQuestionScores = userQuestionScores;
    }

    @Override
    public String toString() {
        return "UserQuestionScoreMessage{" +
                "type='" + type + '\'' +
                ", userQuestionScores=" + userQuestionScores +
                '}';
    }
}
