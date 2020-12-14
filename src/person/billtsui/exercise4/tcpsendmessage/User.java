package person.billtsui.exercise4.tcpsendmessage;

import java.io.Serializable;

/**
 * @author billtsui
 * @date 2020/12/14
 */
public class User implements Serializable {
    private static final long serialVersionUID = 5991665398592979265L;
    private String userName;
    private String pwd;

    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
