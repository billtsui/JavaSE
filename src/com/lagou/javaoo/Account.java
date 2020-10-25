package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 17:02
 */
public abstract class Account {
    private int money;

    public Account() {
    }

    public Account(int money) {
        setMoney(money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("金额不合理哟！！！");
        }
    }

    /**
     * 抽象方法返回活期或者定期的利息
     * @return double类型的利息
     *
     * final 和 private 不能修饰 abstract关键字
     * private不能被继承，final不能被override
     * static 也不能修饰abstract关键字
     */
    public abstract double getLixi();
}
