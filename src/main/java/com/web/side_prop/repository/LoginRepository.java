package com.web.side_prop.repository;

import com.web.side_prop.domain.model.UserAuthority;
import com.web.side_prop.domain.model.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface LoginRepository {

    @Transactional
    Optional<Users> selectById(@Param("id") String id);

    @Transactional
    List<UserAuthority> selectAuthorityById(@Param("id") String id);
}
