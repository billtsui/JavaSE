package person.billtsui.exercise4.onlinechat;

import java.io.IOException;
import java.net.Socket;

/**
 * @author billtsui
 * @date 2020/12/15
 */
public class Test {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // 建立连接
            socket = new Socket("127.0.0.1", 8088);
            System.out.println(socket);
            // 创建客户端对象
            Client user = new Client("关公", socket);
            // 开始消息的交互
            Thread s = user.send();
            Thread r = user.receive();
            s.start();
            r.start();
            s.join();
            r.join();
            // 关闭各种流
            user.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } finally {
            if (null != socket) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
