package person.billtsui.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author billtsui
 * @date 2020/12/7
 */
public class ServerStringTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        BufferedReader bufferedReader = null;
        PrintStream ps = null;
        try {
            ss = new ServerSocket(8082);
            System.out.println("等待客户端的连接请求......");
            s = ss.accept();
            System.out.println("客户端连接成功！");
            bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String s1 = bufferedReader.readLine();
            System.out.println("客户端发来的内容是：" + s1);


            ps = new PrintStream(s.getOutputStream());
            ps.println("I received");
            System.out.println("服务器发送数据成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                s.close();
                ss.close();
                bufferedReader.close();
                ps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
