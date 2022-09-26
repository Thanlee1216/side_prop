package com.web.side_prop.service;

import com.web.side_prop.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public List<Map<String, Object>> testSvc(Map<String, Object> param) {
        return testRepository.testInfo(param);
    }

    public int testSvcInsert(Map<String, Object> param) {
        return testRepository.testInsert(param);
    }


}
