package com.lagou.javaoo.exercise.three;

/**
 * @author billtsui
 * @date 2020/10/28
 * 上网套餐类
 */
public class NetCombo extends AbstractCombo implements NetServiceInterface {
    //上网流量
    private int flow;

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    @Override
    public void display() {
        System.out.println("当前上网套餐上网流量：" + getFlow() + "，每月资费：" + getMonthFee());
    }

    @Override
    public void netService(int flow, SIMCard sim) {
        System.out.println("当前上网流量为：" + flow + "。流量卡号为：" + sim.getSimNumber());
        sim.setFlow(10);
    }
}
