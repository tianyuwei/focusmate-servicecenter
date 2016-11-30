/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.service;

import com.focusmate.services.datasource.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tianyuwei
 * @version id: StationService, v 0.1 16/11/19 下午2:51 tianyuwei Exp $$
 */
@Service
public class StationService {
    @Autowired
    private StationRepository stationRepository;

}
