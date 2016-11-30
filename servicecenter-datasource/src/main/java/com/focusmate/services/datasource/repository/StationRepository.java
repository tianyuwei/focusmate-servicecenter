package com.focusmate.services.datasource.repository;

import com.focusmate.services.datasource.entities.Station;

/**
 * Created by tianyuwei on 16/11/19.
 */
public interface StationRepository {

    Station findByUserName(String username);

}
