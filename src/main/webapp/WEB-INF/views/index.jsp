<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>M-012분석시스템</title>
</head>

<html class="fontawesome-i2svg-active fontawesome-i2svg-complete">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="" rel="stylesheet">
<%--    <script src="js/jquery-1.12.4.js"></script>--%>
<%--    <script src="js/jquery-ui.js"></script>--%>
<%--    <link href="css/styles.css" rel="stylesheet">--%>
<%--    <link rel="stylesheet" href="/css/jquery-ui.css">--%>
<%--    <link rel="stylesheet" href="/css/bootstrap-datetimepicker.css">--%>
</head>
    <script>
        // $.datepicker.setDefaults({
        //     dateFormat: 'yy-mm',
        //     prevText: '이전 달',
        //     nextText: '다음 달',
        //     monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
        //     monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
        //     dayNames: ['일', '월', '화', '수', '목', '금', '토'],
        //     dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
        //     dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
        //     showMonthAfterYear: true,
        //     yearSuffix: '년'
        // });
        //
        // $(function () {
        //     $("#datepicker1, #datepicker2").datepicker({
        //         dateFormat: 'yy.mm.dd'
        //     });
        // });
    </script>

<body class="sb-nav-fixed">
</body>
<div id="layoutSidenav">
    <button id="searchBtn" type="button" class="">
        검색
    </button>
</div>
<script>
    $("#searchBtn").on("click", function() {
        let param = {
            "id" : $("#datepicker1").val()
            , "name" : $("#datepicker2").val()
        }
        $.ajax({
                type: "GET",
                url: '/testInsert',
                data:param,
            dataType: "json",
            success: function(data){
                    console.log(data.msg);
                },
                error:function(){
                    console.log("fail");
                }
            }
        );
    })
</script>

</html>