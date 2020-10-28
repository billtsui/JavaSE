package com.lagou.javaoo.exercise.three;

/**
 * @author billtsui
 * @date 2020/10/28
 * 用户消费信息类
 */
public class UserConsume {
    //通话时长
    private int callMinutes;

    //上网流量
    private int netFlow;

    //每月消费金额
    private double consume;

    public UserConsume(){}

    public UserConsume(int callMinutes, int netFlow, double consume) {
        setCallMinutes(callMinutes);
        setNetFlow(netFlow);
        setConsume(consume);
    }

    public int getCallMinutes() {
        return callMinutes;
    }

    public void setCallMinutes(int callMinutes) {
        this.callMinutes = callMinutes;
    }

    public int getNetFlow() {
        return netFlow;
    }

    public void setNetFlow(int netFlow) {
        this.netFlow = netFlow;
    }

    public double getConsume() {
        return consume;
    }

    public void setConsume(double consume) {
        this.consume = consume;
    }
}
