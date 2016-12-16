package com.focusmate.services.datasource.repository;

import com.focusmate.services.datasource.entities.Workshop;

/**
 * Created by tianyuwei on 16/12/15.
 */
public interface WorkshopRepository {

    int insertSelective(Workshop record);
}
