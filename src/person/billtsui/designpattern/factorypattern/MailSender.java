package person.billtsui.designpattern.factorypattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("正在发送邮件");
    }
}
