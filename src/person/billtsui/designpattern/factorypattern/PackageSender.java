package person.billtsui.designpattern.factorypattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class PackageSender implements  Sender {
    @Override
    public void send() {
        System.out.println("Package sending......");
    }
}
