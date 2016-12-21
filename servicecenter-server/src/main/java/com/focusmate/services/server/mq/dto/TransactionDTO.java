/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.mq.dto;

/**
 *
 * @author tianyuwei
 * @version id: TransactionDTO, v 0.1 16/12/21 上午10:43 tianyuwei Exp $$
 */
public class TransactionDTO {
    private String  transactionId;

    private Integer status;

    private Long    time;

    public TransactionDTO(String transactionId, Integer status, Long time) {
        this.transactionId = transactionId;
        this.status = status;
        this.time = time;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
