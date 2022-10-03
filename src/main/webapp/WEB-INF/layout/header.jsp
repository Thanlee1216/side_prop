<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<body>
    <div class="navbar">
        <div class="navbar-inner">
            <div class="container">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <a href="/" class="brand">
                <img src="resources/img/logo.png" width="120" height="40" alt="Logo" />
                <!-- This is website logo -->
                </a>
                <!-- Navigation button, visible on small resolution -->
                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <i class="icon-menu"></i>
                </button>
            <!-- Main navigation -->
                <div class="nav-collapse collapse">
                    <form id="logoutForm" name="logoutForm" method="post" action="/logout">

                    <ul class="nav" id="top-navigation">
                        <li class="active"><a href="#home">Home</a></li>
                        <li><a href="#service">Services</a></li>
                        <li><a href="#portfolio">Portfolio</a></li>
                        <li><a href="#about">About</a></li>
                        <li><a href="#clients">Clients</a></li>
                        <li><a href="#price">Price</a></li>
                        <li><a href="#contact">Contact</a></li>

                    <security:authorize access="isAnonymous()">
                        <li><a href="/login"><span>로그인</span></a></li>
                        <li><a href="signup"><span>회원가입</span></a></li>
                    </security:authorize>
                    <security:authorize access="isAuthenticated()">
                        <li><a href="/mypage"><span>마이페이지</span></a></li>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <li><a href="javascript:fn_submit()">로그아웃</a></li>
                    </security:authorize>
                    </ul>
                </form>

                </div>
            </div>
        </div>
    </div>
</body>

    <script>
        function fn_submit() {
            $("#logoutForm").submit();
        }
    </script>
