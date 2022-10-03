package com.web.side_prop.service;

import com.web.side_prop.config.security.SpringUser;
import com.web.side_prop.domain.model.UserAuthority;
import com.web.side_prop.domain.model.Users;
import com.web.side_prop.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final LoginRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Optional<Users> optionalUser = loginRepository.selectById(id);
        return optionalUser.map(user -> {
            List<UserAuthority> authority = loginRepository.selectAuthorityById(user.getId());

            List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
            for (UserAuthority userAuthority : authority) {
                grantedAuthorities.add(new SimpleGrantedAuthority(userAuthority.getAuthority()));
            }

            SpringUser springUser = new SpringUser(user.getEmail(), user.getPassword(), grantedAuthorities, user);

            return springUser;

        }).orElseThrow(() -> new BadCredentialsException("일치하지 않습니다."));
    }
}


