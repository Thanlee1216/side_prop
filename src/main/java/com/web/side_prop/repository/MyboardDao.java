package com.web.side_prop.repository;

import com.web.side_prop.common.Criteria;
import com.web.side_prop.domain.model.Myboard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MyboardDao {
    private final MyboardRepository mapper;

    public List<Myboard> getList(Criteria cri){
        return mapper.getList(cri);
    }
}
