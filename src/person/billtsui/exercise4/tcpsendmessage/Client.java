package person.billtsui.exercise4.tcpsendmessage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author billtsui
 * @date 2020/12/14
 */
public class Client {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        Socket s = null;
        try {
            s = new Socket("localhost", 8086);
            System.out.println("客户端启动，连接本机8086端口");
            User user = new User("admin", "123456");
            UserMessage userMessage = new UserMessage("check", user);
            out = new ObjectOutputStream(s.getOutputStream());
            out.writeObject(userMessage);

            in = new ObjectInputStream(s.getInputStream());
            UserMessage receiveMessage = (UserMessage) in.readObject();
            if ("success".equals(receiveMessage.getType())) {
                System.out.println("登陆成功");
            } else {
                System.out.println("登陆失败");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
