package person.billtsui.exercise5.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class Question implements Serializable {
    private static final long serialVersionUID = -8518782214468776871L;
    private int questionId;
    private String topic;
    private Map<Character, String> answer;
    private String correctAnswer;
    private int score;

    public Question() {
    }

    public Question(int questionId) {
        this.questionId = questionId;
    }

    public Question(String topic) {
        this.topic = topic;
    }

    public Question(int questionId, String topic, Map<Character,String> answer, String correctAnswer, int score) {
        this.questionId = questionId;
        this.topic = topic;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
        this.score = score;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Map<Character, String> getAnswer() {
        return answer;
    }

    public void setAnswer(Map<Character, String> answer) {
        this.answer = answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", topic='" + topic + '\'' +
                ", answer=" + answer +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return questionId == question.questionId ||
                topic.equals(question.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, topic);
    }
}
