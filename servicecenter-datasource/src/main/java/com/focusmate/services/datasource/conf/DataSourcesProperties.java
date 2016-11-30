/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.conf;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 数据源配置参数
 * @author tianyuwei
 * @version id: DataSourcesProperties, v 0.1 16/11/6 下午2:28 tianyuwei Exp $$
 */
@Configuration
@ConfigurationProperties(prefix = "datasource")
public class DataSourcesProperties {

    //主数据库连接
    @NotNull
    private String  jdbcUrlMaster;
    @NotNull
    private String  usernameMaster;
    @NotNull
    private String  passwordMaster;
    //从数据库连接
    @NotNull
    private String  jdbcUrlSlave;
    @NotNull
    private String  usernameSlave;
    @NotNull
    private String  passwordSlave;

    //数据库公共配置
    @NotNull
    private String  driverClassName;
    @NotNull
    private String  connectionTestQuery;
    @NotNull
    private Long    connectionTimeoutMs;
    @NotNull
    private Long    idleTimeoutMs;
    @NotNull
    private Long    maxLifetimeMs;
    @NotNull
    private Integer maxPoolSize;
    @NotNull
    private Integer minIdle;

    //事务超时
    @NotNull
    private Integer transactionTimeoutS;

    public String getJdbcUrlMaster() {
        return jdbcUrlMaster;
    }

    public void setJdbcUrlMaster(String jdbcUrlMaster) {
        this.jdbcUrlMaster = jdbcUrlMaster;
    }

    public String getUsernameMaster() {
        return usernameMaster;
    }

    public void setUsernameMaster(String usernameMaster) {
        this.usernameMaster = usernameMaster;
    }

    public String getPasswordMaster() {
        return passwordMaster;
    }

    public void setPasswordMaster(String passwordMaster) {
        this.passwordMaster = passwordMaster;
    }

    public String getJdbcUrlSlave() {
        return jdbcUrlSlave;
    }

    public void setJdbcUrlSlave(String jdbcUrlSlave) {
        this.jdbcUrlSlave = jdbcUrlSlave;
    }

    public String getUsernameSlave() {
        return usernameSlave;
    }

    public void setUsernameSlave(String usernameSlave) {
        this.usernameSlave = usernameSlave;
    }

    public String getPasswordSlave() {
        return passwordSlave;
    }

    public void setPasswordSlave(String passwordSlave) {
        this.passwordSlave = passwordSlave;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getConnectionTestQuery() {
        return connectionTestQuery;
    }

    public void setConnectionTestQuery(String connectionTestQuery) {
        this.connectionTestQuery = connectionTestQuery;
    }

    public Long getConnectionTimeoutMs() {
        return connectionTimeoutMs;
    }

    public void setConnectionTimeoutMs(Long connectionTimeoutMs) {
        this.connectionTimeoutMs = connectionTimeoutMs;
    }

    public Long getIdleTimeoutMs() {
        return idleTimeoutMs;
    }

    public void setIdleTimeoutMs(Long idleTimeoutMs) {
        this.idleTimeoutMs = idleTimeoutMs;
    }

    public Long getMaxLifetimeMs() {
        return maxLifetimeMs;
    }

    public void setMaxLifetimeMs(Long maxLifetimeMs) {
        this.maxLifetimeMs = maxLifetimeMs;
    }

    public Integer getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    public Integer getTransactionTimeoutS() {
        return transactionTimeoutS;
    }

    public void setTransactionTimeoutS(Integer transactionTimeoutS) {
        this.transactionTimeoutS = transactionTimeoutS;
    }
}
