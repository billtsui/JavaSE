package person.billtsui.exception;

/**
 * @author billtsui
 * @date 2020/11/19
 */
public class ExceptionFinallyTest {
    public static void main(String[] args) {
        int ia = 10;
        int ib = 0;
        try {
            System.out.println(ia / ib);
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("无论是否发生异常都会执行我哦");
        }

    }
}
