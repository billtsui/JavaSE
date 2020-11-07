package person.billtsui.javaapi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author billtsui
 * @date 2020/11/1
 */
public class RegTest {
    public static void main(String[] args) {

        // 正则表达式匹配6位银行卡密码

        String reg = "^[0-9]{6}$";

        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("请输入您的银行卡密码：");
//
//            String pwd = sc.next();
//
//            if (pwd.matches(reg)) {
//                System.out.println("银行卡密码的格式正确！");
//                break;
//            } else {
//                System.out.println("银行卡密码的格式错误！");
//            }
//        }

        //正则表达式匹配QQ号码，第一位非0的5-15位数字
        String qqReg = "^[1-9]\\d{4,14}$";

        //匹配手机号 由1开头，第二位数是3、4、5、7、8中的一位，总数11位
        String mobilePhoneReg = "1[34578]\\d{9}";

        //拆分字符串
        String str1 = "1001,zhangfei,30";
        String[] result = str1.split("^,$");
        System.out.println(Arrays.toString(result));

        System.out.println("-------------------");
        //准备一个字符串内容并进行替换
        String str2 = "我的小名叫大帅哥";
        String str3 = str2.replace('我', '你');
        System.out.println(str3);
    }
}
