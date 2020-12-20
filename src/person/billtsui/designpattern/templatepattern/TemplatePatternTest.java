package person.billtsui.designpattern.templatepattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class TemplatePatternTest {
    public static void main(String[] args) {

        AbstractCalculator abstractCalculator = new Plus();
        int result = abstractCalculator.splitExpression("1+1", "\\+");
        System.out.println("最终的运算结果是：" + result);

    }
}
