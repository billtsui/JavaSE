package person.billtsui.designpattern.decoratorpattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class SourceableTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
//        sourceable.method();

        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();
    }
}
