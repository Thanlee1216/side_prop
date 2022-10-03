<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<s:eval var="activeProfile" expression="@environment.getActiveProfiles()" />

<fmt:setLocale value="ko"/>

<!DOCTYPE html>
<html lang="ko">
<head>

    <meta charset=utf-8>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pluton Theme by BraphBerry.com</title>
    <!-- Load Roboto font -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700&amp;subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <!-- Load css styles -->
    <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/pluton.css" />
    <!--[if IE 7]>
    <link rel="stylesheet" type="text/css" href="/resources/css/pluton-ie7.css" />
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="/resources/css/jquery.cslider.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/jquery.bxslider.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/animate.css" />
    <link href="/resources/css/global.css" rel="stylesheet">

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/img/ico/apple-touch-icon-144.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/img/ico/apple-touch-icon-114.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/img/apple-touch-icon-72.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/img/ico/apple-touch-icon-57.png">
    <link rel="shortcut icon" href="/resources/img/ico/favicon.ico">

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>


</head>

<div class="container-xxxl bg-white p-0">
    <!-- Spinner Start -->


    <c:set var="URL" value="${requestScope['javax.servlet.forward.request_uri']}"/>
<%--    <c:choose>--%>
<%--        <c:when test="${URL == '/login' or URL == '/signup' or URL == '/signup/email'}">--%>
<%--            <t:insertAttribute name="body" />--%>
<%--        </c:when>--%>
<%--        <c:otherwise>--%>
            <t:insertAttribute name="header" />
            <t:insertAttribute name="body" />
            <t:insertAttribute name="footer" />
<%--        </c:otherwise>--%>
<%--    </c:choose>--%>
</div>

    <!-- ScrollUp button end -->
    <!-- Include javascript -->
    <script src="/resources/js/jquery.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.mixitup.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap.js"></script>
    <script type="text/javascript" src="/resources/js/modernizr.custom.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.bxslider.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.cslider.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.placeholder.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.inview.js"></script>
    <!-- Load google maps api and call initializeMap function defined in app.js -->
    <script async="" defer="" type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=false&callback=initializeMap"></script>
    <!-- css3-mediaqueries.js for IE8 or older -->
    <!--[if lt IE 9]>
    <script src="/resources/js/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="/resources/js/app.js"></script>

</body>
</html>
