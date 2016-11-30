/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.conf;

import java.util.HashMap;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import com.zaxxer.hikari.HikariDataSource;

/**
 * 数据源的配置
 * @author tianyuwei
 * @version id: DataSourcesConfiguration, v 0.1 16/11/6 下午2:27 tianyuwei Exp $$
 */
@Configuration
@MapperScan("com.focusmate.services.datasource.mapper")
public class DataSourcesConfiguration {

    @Autowired
    private DataSourcesProperties properties;

    /**
     * 获取返回数据源
     *
     * @return
     */
    private HikariDataSource getAbstractDataSource() {
        final HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(properties.getDriverClassName());
        ds.setConnectionTestQuery(properties.getConnectionTestQuery());
        ds.setConnectionTimeout(properties.getConnectionTimeoutMs());
        ds.setIdleTimeout(properties.getIdleTimeoutMs());
        ds.setMaxLifetime(properties.getMaxLifetimeMs());
        ds.setMaximumPoolSize(properties.getMaxPoolSize());
        ds.setMinimumIdle(properties.getMinIdle());
        return ds;
    }

    /**
     * 主数据库数据源
     *
     * @return
     */
    public DataSource getMasterDataSource() {
        HikariDataSource ds = this.getAbstractDataSource();
        ds.setJdbcUrl(properties.getJdbcUrlMaster());
        ds.setUsername(properties.getUsernameMaster());
        ds.setPassword(properties.getPasswordMaster());
        return ds;
    }

    /**
     * 从数据库数据源
     *
     * @return
     */
    public DataSource getSlaveDataSource() {
        HikariDataSource ds = this.getAbstractDataSource();
        ds.setJdbcUrl(properties.getJdbcUrlSlave());
        ds.setUsername(properties.getUsernameSlave());
        ds.setPassword(properties.getPasswordSlave());
        return ds;
    }

    /**
     * 获取动态数据源实现类
     *
     * @return
     */
    @Bean(name = "dataSource")
    @Primary
    public DynamicDataSource getDynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //默认主数据源
        dynamicDataSource.setDefaultTargetDataSource(this.getSlaveDataSource());
        dynamicDataSource.setTargetDataSources(new HashMap<Object, Object>() {

            /**  */
            private static final long serialVersionUID = 1L;
            {
                this.put("master", getMasterDataSource());
            }
        });
        return dynamicDataSource;
    }

    /**
     * 数据源事务管理器
     *
     * @return
     */
    @Bean
    public DataSourceTransactionManager getTransactionManager() {
        return new DataSourceTransactionManager(getDynamicDataSource());
    }

    /**
     * 编程式事务
     *
     * @return
     */
    @Bean
    public TransactionTemplate getTransactionTemplate() {
        DataSourceTransactionTemplate transactionTemplate = new DataSourceTransactionTemplate();
        transactionTemplate.setTimeout(properties.getTransactionTimeoutS());
        transactionTemplate.setTransactionManager(this.getTransactionManager());
        return transactionTemplate;
    }

    /**
     * mybatis 的sessionFactory
     *
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(this.getDynamicDataSource());
        //扫描mapper.xml
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:sqlmap/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }
}
