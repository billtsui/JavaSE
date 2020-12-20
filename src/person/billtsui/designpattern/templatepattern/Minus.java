package person.billtsui.designpattern.templatepattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class Minus extends  AbstractCalculator {
    @Override
    public int calculator(int ia, int ib) {
        return ia - ib;
    }
}
