package com.web.side_prop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TestRepository {

    @Transactional
    public void testInfo();



}
