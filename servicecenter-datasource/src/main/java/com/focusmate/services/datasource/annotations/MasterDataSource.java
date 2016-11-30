/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 主数据源注解
 * 方法上不加注解时，默认为slave
 * @author tianyuwei
 * @version id: MasterDataSource, v 0.1 16/11/6 下午3:33 tianyuwei Exp $$
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MasterDataSource {

}
