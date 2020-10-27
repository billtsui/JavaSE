package com.lagou.javafundamental.exercise;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 获取某天是该年中的第几天
 */
public class GetDayofYear {
    public static void main(String[] args) {
        System.out.println("请输入年月日，以YYYYMMDD形式，例如20080812");
        Scanner sc = new Scanner(System.in);
        String dateInfo = sc.next();
        sc.close();

        String year = dateInfo.substring(0, 4);
        String month = dateInfo.substring(4, 6);
        String day = dateInfo.substring(6, 8);

        System.out.println("您输入的年月日信息为：" + year + month + day);

        Calendar ca = Calendar.getInstance();

        // Calendar的month下标从0开始
        ca.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));

        System.out.println("该日期为当年第:" + ca.get(Calendar.DAY_OF_YEAR) + "天");
    }
}
