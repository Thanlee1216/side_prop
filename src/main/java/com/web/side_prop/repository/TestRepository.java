package com.web.side_prop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Repository
public interface TestRepository {

    @Transactional
    public Map<String, Object> testInfo(Map<String, Object> param);



}
