package person.billtsui.exercise4.tcpsendmessage;

import java.io.Serializable;

/**
 * @author billtsui
 * @date 2020/12/14
 */
public class UserMessage implements Serializable {
    private static final long serialVersionUID = 50597598459333227L;
    private String type;
    private User user;

    public UserMessage(String type, User user) {
        this.type = type;
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
