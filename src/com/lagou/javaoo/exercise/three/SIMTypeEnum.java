package com.lagou.javaoo.exercise.three;

/**
 * @author billtsui
 * @date 2020/10/27
 */
public enum SIMTypeEnum {
    //手机卡类型
    STANDARD("大卡"),
    MINI("小卡"),
    MICRO("微型卡");

    private String desc;
    private SIMTypeEnum(String desc){
        setDesc(desc);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
