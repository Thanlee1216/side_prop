package com.web.side_prop.service;

import com.web.side_prop.common.Criteria;
import com.web.side_prop.domain.model.Myboard;
import com.web.side_prop.repository.MyboardDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyboardService {

    private final MyboardDao myboardDao;

    public List<Myboard> getList(Criteria cri) {
        return myboardDao.getList(cri);
    }
}
