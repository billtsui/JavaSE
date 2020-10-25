package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 17:05
 */
public class FixedAccount extends Account {

    public FixedAccount(int money) {
        super(money);
    }

    @Override
    public double getLixi() {
        //本金 * 年利率 * 年数
        return getMoney() * 0.02 * 1;
    }

    public static void main(String[] args) {
        Account account = new FixedAccount(10000);
        double lixi = account.getLixi();
        System.out.println("一年期定期的利息是:" + lixi);
    }
}
