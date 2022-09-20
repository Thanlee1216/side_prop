<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script>
//   $(function () {
//     let token = $("input[name='_csrf']").val();
//     let header = "X-CSRF-TOKEN";
//
//     $(document).ajaxSend(function (e, xhr, options) {
//       xhr.setRequestHeader(header, token);
//     });
//
//     $.ajaxSetup({
//       error: function (xhr, status, err) {
//         if (xhr.status == 401) {
// //          alert("인증실패(401)");
//           alert("잘못된 접근입니다. 로그인 페이지로 이동합니다.");
//           location.href = "/login";
//         } else if (xhr.status == 403) {
//           //          alert("세션만료(403)");
//           alert("잘못된 접근입니다. 로그인 페이지로 이동합니다.");
//           location.href = "/login";
//         }
//       }
//     });
//   });
//
//   let agent = navigator.userAgent.toLowerCase();
//   if ((navigator.appName == 'Netscape' && agent.indexOf('trident') != -1) || (agent.indexOf("msie") != -1)) {
//     // ie일 경우
//     if (window.location.pathname !== "/notSupported") {
//       alert("인터넷 익스플로러는 지원하지 않습니다.")
//       location.href = "/notSupported"
//     }
//   }
</script>

