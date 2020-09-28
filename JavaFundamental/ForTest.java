package JavaFundamental;

public class ForTest {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            System.out.println("今晚吃鸡，大吉大利，正在进行第" + i + "场游戏。。。");
            Thread.sleep(5000);
            System.out.println("本场游戏结束.\n\n\n");
        }
    }
}
