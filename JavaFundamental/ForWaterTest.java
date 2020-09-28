package JavaFundamental;

/**
 * 打印三位数中的所有水仙花数
 */
public class ForWaterTest {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            // 拆分 百 十 个 位数字
            int hundred = i / 100;
            int decade = (i % 100) / 10;
            int num = i % 10;
            if (i == hundred * hundred * hundred + decade * decade * decade + num * num * num) {
                System.out.println("i=" + i);
            }
        }
    }
}
