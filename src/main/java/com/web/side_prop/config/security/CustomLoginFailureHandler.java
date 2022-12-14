package com.web.side_prop.config.security;

import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CustomLoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        String email = (String) request.getParameter("email");
        request.getSession().setAttribute("email", email);


        if (exception instanceof InternalAuthenticationServiceException) {
            getRedirectStrategy().sendRedirect(request, response, "/member/password/resetPasswordStepOne");
        } else if (exception.getMessage().equals("탈퇴")){
            getRedirectStrategy().sendRedirect(request, response, "/login?&withdrawal=true");
        } else {
            getRedirectStrategy().sendRedirect(request, response, "/login?&error=true");
        }
    }

}
