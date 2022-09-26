package com.web.side_prop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
public interface TestRepository {

    @Transactional
    public List<Map<String, Object>> testInfo(Map<String, Object> param);

    @Transactional
    public int testInsert(Map<String, Object> param);



}
