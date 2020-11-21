package person.billtsui.exception;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author billtsui
 * @date 2020/11/19
 */
public class FileTest {
    //子目录的遍历
    public static void show(File file) {
        File[] filesArray = file.listFiles();
        for (File nfile : filesArray) {
            String fileName = nfile.getName();
            if (nfile.isFile()) {
                System.out.println(fileName);
            } else if (nfile.isDirectory()) {
               show(nfile);
            }
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("/Users/billtsui/Code/a.json");
            if (file.exists()) {
                System.out.println("文件的名称是：" + file.getName());
                System.out.println("文件的大小是：" + file.length());
                System.out.println("文件的最后一次修改时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
                System.out.println("文件的绝对路径：" + file.getAbsolutePath());
                System.out.println(file.delete() ? "文件删除成功" : "文件删除失败");
            } else {
                boolean result = file.createNewFile();
                if (result) {
                    System.out.println("文件创建成功");
                } else {
                    System.out.println("文件创建失败");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("---------------------------------------");

        File f2 = new File("/Users/billtsui/code/捣乱");
        if (f2.exists()) {
            System.out.println("目录名称是：" + f2.getName());
            System.out.println(f2.delete() ? "目录删除成功" : "目录删除失败");
        } else {
            System.out.println(f2.mkdir() ? "目录创建成功" : "目录创建失败");
        }

        //打印指定目录中所有的内容
        File f3 = new File("/Users/billtsui/Code");
        File[] filesArray = f3.listFiles();
        for (File file : filesArray) {
            String fileName = file.getName();
            if (file.isFile()) {
                System.out.println(fileName);
            } else if (file.isDirectory()) {
                System.out.println("[" + fileName + "]");
            }
        }

        System.out.println("-----------------");
        FileTest.show(new File("/Users/billtsui/Code/blog"));
    }
}
