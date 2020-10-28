package com.lagou.javaoo.exercise.three;

/**
 * @author billtsui
 * @date 2020/10/27
 * 手机卡类
 */
public class SIMCard {
    //手机卡类型
    private SIMTypeEnum simType;

    //卡号
    private String simNumber;

    //用户名
    private String userName;

    //密码
    private String pwd;

    //账户余额
    private double balance;

    //通话时长
    private int callMinutes;

    private UserConsume userConsume;

    //上网流量
    private int flow;

    public SIMTypeEnum getSimType() {
        return simType;
    }

    public void setSimType(SIMTypeEnum simType) {
        this.simType = simType;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCallMinutes() {
        return callMinutes;
    }

    public void setCallMinutes(int callMinutes) {
        this.callMinutes = callMinutes;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public UserConsume getUserConsume() {
        return userConsume;
    }

    public void setUserConsume(UserConsume userConsume) {
        this.userConsume = userConsume;
    }

    public void display() {
        System.out.println("当前卡号为：" + getSimNumber() + "。用户名为：" + getUserName() + "。通话时长：" + this.getCallMinutes() + "分钟，已用流量：" + this.getFlow() + "MB");
    }

    public void call(int callMinutes, SIMCard sim) {

    }
}
