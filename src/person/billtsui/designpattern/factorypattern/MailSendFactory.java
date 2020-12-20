package person.billtsui.designpattern.factorypattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class MailSendFactory implements Provider {
    @Override
    public Sender produce() {
       return new MailSender();
    }
}
