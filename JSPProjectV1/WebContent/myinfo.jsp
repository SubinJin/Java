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
			#myinfofrm {width : 400px; margin:0 auto; padding-top : 85px;}
			#myinfofrm label{display : inline-block; width : 120px; text-align : right;}
			#myinfofrm div{margin : 7px 0;}
			img{margin:250px auto;}
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

		<h1>회원정보</h1>		
		<div id = "myinfofrm">
		<div id="contents">
		<div><label>아이디</label><span> ronaldotree</span></div>
		<div><label>이름</label><span> SubinJin</span></div>
		<div><label>이메일</label><span> jeensb0705@naver.com</span></div>
		<div><label>가입일</label><span> 2018-01-15 16:02:12</span></div>
		</div></div>
	
		<footer>
			<hr>
			<p>copyright &copy; 2018. ronaldotree <sup>&reg;</sup>. all rights reserved.</p>
		</footer>
		
	</body>
</html>