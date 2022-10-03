package com.web.side_prop.config.security;

import com.web.side_prop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@RequiredArgsConstructor
@Configuration
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    public final Integer SESSION_TIMEOUT_IN_SECONDS = 30*60;
    private final HttpSession httpSession;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String id = (String)authentication.getPrincipal();
        String password = (String)authentication.getCredentials();
        SpringUser springUser;
        //스프링 시큐리티 적용 폼 로그인
        springUser = (SpringUser) userService.loadUserByUsername(id);
//        if (!passwordEncoder.matches(password, springUser.getPassword())) {
//            // 로그인 실패 이력 남기기
////            userService.updateFailedLoginCountPlus(email);
//            throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
//        }

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(id, password, springUser.getAuthorities());
        authenticationToken.setDetails(springUser);
        return authentication;

    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
