<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
	<head>
		<meta charset="UTF-8">
		<title>JSP 프로젝트 V1</title>
		<link href="./css/normalize.css" rel="stylesheet">
		<link href="./css/ronaldotree.css" rel="stylesheet">
		<style>
			#loginfrm {width : 400px; margin:0 auto; padding-top : 85px;}
			#loginfrm label{display : inline-block; width : 120px; text-align : right;}
			#loginfrm div{ margin : 7px 0;}
		</style>
	</head>
	<body>
		<header>
			<h1>JSP 프로젝트 V1</h1>
			<ul> 
				<li><a href="index.jsp">Home</a></li>
				<li><a href="join.jsp">회원가입</a></li>
				<li><a href="login.jsp">로그인</a></li>
				<li><a href="list.jsp">게시판</a></li>
			 	<li><a href="myinfo.jsp">회원정보</a></li>
			 </ul>
			<hr>
		</header>
		<h1>로그인</h1>
		<div id = "loginfrm">
		<div id="contents">
		<form id="loginfrm" method = "post" action="loginok.jsp">
		<div><label>아이디</label><input type="text" name="uid" required="required"></div>
		<div><label>비밀번호</label><input type="text" name="pwd" required="required"></div>
		</form>
		<label></label><button type="submit">로그인</button></div>
		</div>
		<footer>
			<hr>
			<p>copyright &copy; 2018. ronaldotree <sup>&reg;</sup>. all rights reserved.</p>
		</footer>
		
	</body>
</html>