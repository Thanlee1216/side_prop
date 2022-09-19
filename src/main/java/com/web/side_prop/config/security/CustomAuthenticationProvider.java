package com.web.side_prop.config.security;

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

    //특정 페이지 접속할 수 없게 권한 준다 예를 들어서 마이페이 같은 경우 로그인을 해야만 들어갈 수 있으니까

    private final PasswordEncoder passwordEncoder;
    public final Integer SESSION_TIMEOUT_IN_SECONDS = 30*60;
    private final HttpSession httpSession;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = (String)authentication.getPrincipal();
        String password = (String)authentication.getCredentials();
        SpringUser springUser;



        // 유저 로그인 이력 남기기
//        userService.updateMemberLoginDt(springUser.getMember().getMemberNo());
//        userService.updateFailedLoginCountInit(userId);

        return authentication;

    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
