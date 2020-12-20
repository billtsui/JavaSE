package person.billtsui.designpattern.decoratorpattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("素颜美可以如此之美");
    }
}
