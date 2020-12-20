package person.billtsui.designpattern.proxypattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        source.method();
        System.out.println("代理模式和装饰器模式是不一样的");
    }
}
