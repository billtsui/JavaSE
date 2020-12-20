package person.billtsui.designpattern.templatepattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public abstract class AbstractCalculator {
    public int splitExpression(String exp, String op) {
        String[] sArr = exp.split(op);
        return calculator(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[1]));
    }

    public abstract int calculator(int ia, int ib);
}
