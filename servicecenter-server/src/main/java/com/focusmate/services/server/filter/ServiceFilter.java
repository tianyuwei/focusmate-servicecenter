/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.focusmate.services.common.filter.BaseFilter;
import com.focusmate.services.server.conf.ServerConstacts;

/**
 * 全局请求过滤
 * @author tianyuwei
 * @version id: ServiceFilter, v 0.1 16/11/30 下午4:47 tianyuwei Exp $$
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ServiceFilter extends BaseFilter {
    @Override
    protected boolean toBeFiltered(HttpServletRequest req) {
        if (req.getRequestURI().contains(ServerConstacts.SERVICE_NAME)) {
            return true;
        }
        return false;
    }
}
