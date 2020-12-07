package person.billtsui.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author billtsui
 * @date 2020/12/7
 */
public class ClientStringTest {
    public static void main(String[] args) {
        Socket s = null;
        PrintStream printStream = null;
        BufferedReader br = null;
        try {
            s = new Socket("127.0.0.1", 8082);
            System.out.println("连接服务器成功");
            printStream = new PrintStream(s.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            String content = scanner.next();
            printStream.print(content);
            System.out.println("客户端发送数据内容成功！");


            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String s2 = br.readLine();
            System.out.println("服务器回发的消息是：" + s2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != s) {
                    s.close();
                }
                if (null != printStream) {
                    printStream.close();
                }
                if(null != br){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
