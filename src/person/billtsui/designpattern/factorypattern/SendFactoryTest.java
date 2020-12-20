package person.billtsui.designpattern.factorypattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class SendFactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceSms();
        sender.send();

        Provider provider = new MailSendFactory();
        Sender sender2 = provider.produce();
        sender2.send();

        Sender sender3 = new PackageSendFactory().produce();
        sender3.send();

    }
}
