package person.billtsui.designpattern.proxypattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
