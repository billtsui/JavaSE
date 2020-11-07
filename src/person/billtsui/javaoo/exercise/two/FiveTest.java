package person.billtsui.javaoo.exercise.two;

/**
 * @author billtsui
 * @date 2020/10/28
 */
public class FiveTest {
    public static void main(String[] args) {
        char black_mole = 0x2022;
        char white_mole = 0x25cb;
        Five five = new Five(black_mole, white_mole, 16, 16);
        five.getCheckerboard();
        five.showcheckerboard();
        five.startGame();
    }
}
