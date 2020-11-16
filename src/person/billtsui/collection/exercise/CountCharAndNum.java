package person.billtsui.collection.exercise;

import java.util.Arrays;

/**
 * @author billtsui
 * @date 2020/11/16
 * 编程统计字符串"ABCD123!@#$%ab"中大写字母、小写字母、数字、其它字符的个数并打 印出来。
 */
public class CountCharAndNum {
    public static void main(String[] args) {
        String originChar = "ABCD123!@#$%ab";
        char[] chars = originChar.toCharArray();
        int upperNum = 0;
        int lowerNum = 0;
        int numsNum = 0;
        int otherNum = 0;

        for (char aChar : chars) {
            int charAscii = (int) aChar;

            //大写字母
            if (charAscii >= 65 && charAscii <= 90) {
                upperNum++;
                String template = "发现大写字母%s,目前大写字母已有%d";
                System.out.println(String.format(template,(char)charAscii,upperNum));
            }

            //小写字母
            if (charAscii >= 97 && charAscii <= 122) {
                lowerNum++;
                String template = "发现小写字母%s,目前小写字母已有%d";
                System.out.println(String.format(template,(char)charAscii,lowerNum));
            }

            //数字
            if (charAscii >= 48 && charAscii <= 57) {
                numsNum++;
                String template = "发现数字%s,目前数字已有%d";
                System.out.println(String.format(template,(char)charAscii,numsNum));
            }
        }

        otherNum = chars.length - upperNum - lowerNum - numsNum;

        System.out.println("大写字母个数为：" + upperNum + "。小写字母个数为：" + lowerNum + "。数字个数为：" + numsNum + "。其他字符的个数为：" + otherNum + "。");

    }
}
