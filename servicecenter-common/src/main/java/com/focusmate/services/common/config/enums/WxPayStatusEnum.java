/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.config.enums;

/**
 *
 * @author tianyuwei
 * @version id: WxPayStatusEnum, v 0.1 16/12/18 下午5:59 tianyuwei Exp $$
 */
public enum WxPayStatusEnum {

    /**
     * 完成
     */
    FINISH(0, "完成"),
    /**
     * 下单
     */
    ORDER(1, "下单"),
    /**
     * 付款
     */
    PAY(2, "付款"),
    /**
     * 取消
     */
    CANCEL(-1, "取消"),
    /**
     * 超时
     */
    TIMEOUT(-2, "超时"),
    /**
     * 远端终止
     */
    REMOTE_STOP(-3, "远端终止"),
    /**
     * 远端重置
     */
    REMOTE_RESET(-4, "远端重置"),

    /**
     * 不符
     */
    NOT_FIT(-5, "不符");

    WxPayStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private int    value;
    private String desc;

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
