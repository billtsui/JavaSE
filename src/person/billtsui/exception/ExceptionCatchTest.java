package person.billtsui.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author billtsui
 * @date 2020/11/17
 */
public class ExceptionCatchTest {
    public static void main(String[] args) {
        //创建一个FileInputStream类型的对象与路径对应的文件关联
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/billtsui/b.json");
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("没有发生异常");
        }
    }
}
