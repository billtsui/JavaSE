package com.lagou.javaoo.exercise.three;

/**
 * @author billtsui
 * @date 2020/10/27
 * 3. 按照要求设计并实现以下实体类和接口。
 *
 *     3.1 第一步：设计和实现以下类
 *
 *     （1）手机卡类 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量 行为：显示（卡号 + 用户名 + 当前余额）
 *
 *     （2）通话套餐类 特征：通话时长、短信条数、每月资费 行为: 显示所有套餐信息
 *
 *     （3）上网套餐类 特征：上网流量、每月资费 行为：显示所有套餐信息
 *
 *     （4）用户消费信息类 特征：统计通话时长、统计上网流量、每月消费金额
 *
 *     3.2 第二步：设计和实现以下枚举类 手机卡的类型总共有 3 种：大卡、小卡、微型卡
 *
 *     3.3 第三步：实体类的优化 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类。
 *
 *     3.4 第四步：创建并实现以下接口
 *
 *     （1）通话服务接口 抽象方法: 参数1: 通话分钟, 参数2: 手机卡类对象 让通话套餐类实现通话服务接口。
 *
 *     （2）上网服务接口 抽象方法: 参数1: 上网流量, 参数2: 手机卡类对象 让上网套餐类实现上网服务接口。
 *
 *     3.5 第五步：进行代码测试
 *     编写测试类使用多态格式分别调用上述方法，方法体中打印一句话进行功能模拟即可。
 */
public class Three {
    public static void main(String[] args) {

        //手机卡
        SIMCard sim = new SIMCard();
        sim.setSimType(SIMTypeEnum.MICRO);
        sim.setSimNumber("18516575903");
        sim.setUserName("billtsui");
        sim.setBalance(100D);
        sim.setUserName("username");
        sim.setPwd("password");

        //打印手机卡信息
        sim.display();

        //通话套餐
        CallCombo callCombo = new CallCombo();

        //上网套餐
        NetCombo netCombo = new NetCombo();

        //打印通话信息
        callCombo.display();

        //打印上网信息
        netCombo.display();

        System.out.println("-----------打电话10分钟-------------");
        callCombo.call(10,sim);

        System.out.println("-----------上网10MB----------------");
        netCombo.netService(10,sim);

        sim.display();

    }
}