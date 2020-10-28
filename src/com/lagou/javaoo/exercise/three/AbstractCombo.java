package com.lagou.javaoo.exercise.three;

/**
 * @author billtsui
 * @date 2020/10/28
 */
public abstract class AbstractCombo {
    //每月资费
    private double monthFee;

    public AbstractCombo(){}

    public abstract  void display();

    public double getMonthFee() {
        return monthFee;
    }

    public void setMonthFee(double monthFee) {
        this.monthFee = monthFee;
    }
}
