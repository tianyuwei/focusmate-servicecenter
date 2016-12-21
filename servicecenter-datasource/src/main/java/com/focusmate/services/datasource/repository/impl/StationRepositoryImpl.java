/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.focusmate.services.datasource.entities.Station;
import com.focusmate.services.datasource.entities.StationExample;
import com.focusmate.services.datasource.mapper.StationMapper;
import com.focusmate.services.datasource.repository.StationRepository;

/**
 * 站点
 * @author tianyuwei
 * @version id: StationRepositoryImpl, v 0.1 16/11/19 下午2:58 tianyuwei Exp $$
 */
@Repository
public class StationRepositoryImpl implements StationRepository {

    @Autowired
    private StationMapper mapper;

    @Override
    public Station findByUserName(String username) {
        StationExample example = new StationExample();
        example.createCriteria().andNameEqualTo(username);

        List<Station> stationList = mapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(stationList)) {
            return stationList.get(0);
        } else {
            return null;
        }
    }
}
