/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.conf;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.focusmate.services.datasource.annotations.MasterDataSource;

/**
 * AOP方式 动态选择数据源控制
 * @author tianyuwei
 * @version id: DataSourceAop, v 0.1 16/11/6 下午3:01 tianyuwei Exp $$
 */
@Aspect
@Component
public class DataSourceAop {
    /**
     * 方法环绕方式切面
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.enniu.cloud.services.riskbrainriakdatasource.dao.mapper.*.*(..))")
    public Object doAroundMapper(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result = null;
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();//获取正在执行的方法

        if (DataSourceSwitcher.isManualMasterMode()) {
            //强制要求主数据源
            DataSourceSwitcher.setMasterWithDontChangeSetMode();//设置数据源为主数据源
        } else {
            //根据注解选择数据源
            MasterDataSource dataSource = method.getAnnotation(MasterDataSource.class);
            if (null != dataSource) {
                DataSourceSwitcher.setMasterWithDontChangeSetMode();//设置数据源为主数据源
            } else {
                DataSourceSwitcher.setSlaveWithDontChangeSetMode();//设置为从数据源
            }
        }
        result = proceedingJoinPoint.proceed();
        return result;
    }
}
