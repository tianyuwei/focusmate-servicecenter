package com.focusmate.services.common.config.enums;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Preconditions;

/**
 * Created by tianyuwei on 16/12/15.
 */
public enum StationStatusEnum {
    /**
     * 站点状态:空闲
     */
    Idle("Idle", "空闲"),

    /**
     * 站点状态:繁忙
     */
    Busy("Busy", "繁忙"),

    /**
     * 站点状态:错误
     */
    Error("Error", "错误");

    StationStatusEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private String value;
    private String desc;

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 根据值转为枚举
     *
     * @param value
     * @return
     */
    public static StationStatusEnum fromValue(String value) {
        Preconditions.checkArgument(StringUtils.isNotBlank(value), "value invalid");
        for (StationStatusEnum item : StationStatusEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }
        return null;
    }
}
