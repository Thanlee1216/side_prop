package com.web.side_prop.repository;

import com.web.side_prop.common.Criteria;
import com.web.side_prop.domain.model.Myboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyboardRepository {

    //myboard
    public List<Myboard> getList(Criteria criteria);
}
