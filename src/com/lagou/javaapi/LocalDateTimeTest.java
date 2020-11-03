package com.lagou.javaapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author billtsui
 * @date 2020/11/3
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        //获取当前日期信息并打印
        //获取当前时间信息并打印
        //获取当前日期时间信息并打印

        LocalDate now = LocalDate.now();
        System.out.println("获取到的当前日期是：" + now);

        LocalTime now1 = LocalTime.now();
        System.out.println("获取到的当前时间是：" + now1);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("获取到的当前日期时间是：" + now2);

        System.out.println("---------------------");

        //设置指定的年月日
        LocalDateTime dateTime = LocalDateTime.of(2008, 8, 8, 20, 8, 8);
        System.out.println("指定的日期时间是：" + dateTime);

        System.out.println("获取到的年是：" + dateTime.getYear());
        System.out.println("获取到的月份是：" + dateTime.getMonthValue());
        System.out.println("获取到的日是：" + dateTime.getDayOfMonth());
    }
}
