package person.billtsui.javaapi;

/**
 * @author billtsui
 * @date 2020/10/31
 * 判断字符串是否为回文字符串
 */
public class StringJudgeTest {

    public static void main(String[] args) {
        String str1 = new String("上海自来水来自海上");
        System.out.println("str1 = " + str1);

        boolean result = true;
        for (int i = 0; i < str1.length() / 2; i++) {
            //0和8比，1和7比，2和6，3和5
            if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
                result = false;
            }
        }
        System.out.println(result ? str1 + "是回文！" : str1 + "不是回文！");
    }
}
