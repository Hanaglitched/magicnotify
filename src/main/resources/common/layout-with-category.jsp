<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  isELIgnored="false"
%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Meta Tag -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name='copyright' content=''>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Title Tag  -->
    <title>매직노티 - 매직 더 개더링 카드 가격 알림 서비스</title>
    <!-- Favicon -->
    <link rel="icon" type="image/png" href="../images/favicon.png">
    <!-- Web Font -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

    <!-- StyleSheet -->

    <!-- Bootstrap -->
    <link rel="stylesheet" href="../css/bootstrap.css">
    <!-- Magnific Popup -->
    <link rel="stylesheet" href="../css/magnific-popup.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="../css/font-awesome.css">
    <!-- Fancybox -->
    <link rel="stylesheet" href="../css/jquery.fancybox.min.css">
    <!-- Themify Icons -->
    <link rel="stylesheet" href="../css/themify-icons.css">
    <!-- Nice Select CSS -->
    <link rel="stylesheet" href="../css/niceselect.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="../css/animate.css">
    <!-- Flex Slider CSS -->
    <link rel="stylesheet" href="../css/flex-slider.min.css">
    <!-- Owl Carousel -->
    <link rel="stylesheet" href="../css/owl-carousel.css">
    <!-- Slicknav -->
    <link rel="stylesheet" href="../css/slicknav.min.css">

    <!-- Eshop StyleSheet -->
    <link rel="stylesheet" href="../css/reset.css">
    <link rel="stylesheet" href="../style.css">
    <link rel="stylesheet" href="../css/responsive.css">
</head>
<body>
<div id="container">
    <div id="header">
        <tiles:insertAttribute name="header-wc"/>
    </div>
    </div>
    <div id="content">
        <tiles:insertAttribute name="body"/>
    </div>
    <div id="footer">
        <tiles:insertAttribute name="footer"/>
    </div>
</div>
</body>
</html>