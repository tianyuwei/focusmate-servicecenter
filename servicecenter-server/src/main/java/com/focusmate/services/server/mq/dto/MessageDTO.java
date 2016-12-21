/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.mq.dto;

/**
 * 消息DTO
 * @author tianyuwei
 * @version id: MessageDTO, v 0.1 16/12/20 下午6:34 tianyuwei Exp $$
 */
public class MessageDTO {

    private String uuid;

    private long   time;

    private String service;

    private String content;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
