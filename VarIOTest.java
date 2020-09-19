import java.util.Scanner;

public class VarIOTest {
    public static void main(String[] args) {
        /**
         * 1、声明两个变量用于记录姓名和年龄信息
         * 2、提示用户从键盘输入姓名和年龄信息并放入到变量中
         * 3、打印变量的值
         */

         System.out.println("请输入您的姓名和年龄信息:");

         //创建一个扫描器来扫描键盘输入的内容，System.in代表键盘输入
         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         int age = sc.nextInt();

         System.out.println("name = " + name + ".age = " + age);
         sc.close();

    }
}
