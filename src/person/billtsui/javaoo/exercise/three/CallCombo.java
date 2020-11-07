package person.billtsui.javaoo.exercise.three;

/**
 * @author billtsui
 * @date 2020/10/28
 * 通话套餐类
 */
public class CallCombo extends AbstractCombo implements CallServiceInterface {
    //通话时长
    private int callMinutes;

    //短信条数
    private int msgNum;


    public int getCallMinutes() {
        return callMinutes;
    }

    public void setCallMinutes(int callMinutes) {
        this.callMinutes = callMinutes;
    }

    public int getMsgNum() {
        return msgNum;
    }

    public void setMsgNum(int msgNum) {
        this.msgNum = msgNum;
    }

    @Override
    public void display() {
        System.out.println("当前通话套餐通话时长：" + getCallMinutes() + "，短信条数：" + msgNum + "，每月资费" + getMonthFee());
    }

    @Override
    public void call(int callMinutes, SIMCard sim) {
        System.out.println("当前通话时间：" + callMinutes + "分钟。通话手机卡号为：" + sim.getSimNumber());
        sim.setCallMinutes(10);
    }
}
