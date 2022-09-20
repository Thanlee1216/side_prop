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

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<div class="container-xxxl bg-white p-0">
    <!-- Spinner Start -->


    <c:set var="URL" value="${requestScope['javax.servlet.forward.request_uri']}"/>
    <c:choose>
        <c:when test="${URL == '/login' or URL == '/signup' or URL == '/signup/email'}">
            <t:insertAttribute name="body" />
        </c:when>
        <c:otherwise>
            <t:insertAttribute name="header" />
            <t:insertAttribute name="body" />
            <t:insertAttribute name="footer" />
        </c:otherwise>
    </c:choose>
</div>

<%--<script src="/resources/lib/wow/wow.min.js"></script>--%>
<%--<script src="/resources/lib/easing/easing.min.js"></script>--%>
<%--<script src="/resources/lib/waypoints/waypoints.min.js"></script>--%>
<%--<script src="/resources/lib/counterup/counterup.min.js"></script>--%>
<%--<script src="/resources/lib/owlcarousel/owl.carousel.min.js"></script>--%>
<%--<script src="/resources/lib/isotope/isotope.pkgd.min.js"></script>--%>
<%--<script src="/resources/lib/lightbox/js/lightbox.min.js"></script>--%>

<%--<!-- Template Javascript -->--%>
<%--<script src="/resources/js/main.js"></script>--%>

<script>

  // $(function () {
  //   $("#sideMenu").on("click", function () {
  //     $(".GeneralHeader__wrapper").css("display", "block")
  //   });
  //
  //   $("#close").on("click", function () {
  //     $(".GeneralHeader__wrapper").css("display", "none")
  //   });
  //
  //   $("#SideMenu__background").on("click", function () {
  //     $(".GeneralHeader__wrapper").css("display", "none")
  //   });
  // });

</script>
</body>
</html>
