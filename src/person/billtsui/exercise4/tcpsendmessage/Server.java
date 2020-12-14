package person.billtsui.exercise4.tcpsendmessage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author billtsui
 * @date 2020/12/14
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket accept = null;
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        try {
            serverSocket = new ServerSocket(8086);
            System.out.println("服务端启动，监听8086端口......");
            accept = serverSocket.accept();

            in = new ObjectInputStream(accept.getInputStream());
            Object o = in.readObject();

            UserMessage msg = (UserMessage) o;
            User user = msg.getUser();
            if ("admin".equals(user.getUserName()) && "123456".equals(user.getPwd())) {
                msg.setType("success");
            } else {
                msg.setType("fail");
            }
            out = new ObjectOutputStream(accept.getOutputStream());
            out.writeObject(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
