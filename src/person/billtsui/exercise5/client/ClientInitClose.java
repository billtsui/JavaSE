package person.billtsui.exercise5.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientInitClose {

    /**
     * 自定义成员变量记录socket及流信息
     */
    private Socket s;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public ObjectOutputStream getOos() {
        return oos;
    }

    public ObjectInputStream getOis() {

        return ois;
    }

    /**
     * 自定成员方法实现客户端的初始化操作
     */
    public void clientInit() throws IOException {
        //1.创建socket类型的对象并指定服务器的通讯地址与端口号
        s = new Socket(InetAddress.getLocalHost(),8888);
        //2.使用输入输出流通信
        oos = new ObjectOutputStream(s.getOutputStream());
        ois = new ObjectInputStream(s.getInputStream());
        System.out.println("连接服务器成功");
    }

    /**
     * 自定义成员方法实现客户端的关闭
     */
    public void clientClose() throws IOException {
        //3.关闭Socket并释放相关资源

        oos.close();
        ois.close();
        s.close();
        System.out.println("客户端成功关闭");
    }
}
