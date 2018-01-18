<%@page import="java.util.Random"%>
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
			#viewfrm {width : 800px; margin:0 auto; padding-top : 85px;}
			#viewfrm label{display : inline-block; width : 120px; text-align : right; font-weight : bold;}
			#viewfrm div{margin : 7px 0;}
			#bonmun{display : inline-block; border : 1px solid black; width : 550px; height : 300px;}
			#viewfrm div{margin : 7px 0;}
			.dragup{vertical-align:top;}
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
		<h1>게시판 본문글</h1>
		<% Random r = new Random(); %>
		<div id="contents">
		<div id = "viewfrm">
		<div><label>제&nbsp;&nbsp;&nbsp;&nbsp;목</label> 시간은 금이라구, 친구! 진짜라구, 친구! 정말이라구, 친구! 참말이라구, 친구!</div>
		<div><label>작성자</label> siestageek</div>
		<div><label>작성일</label> 2018-01-15 16:15:43 (<%=r.nextInt(1000) %>)</div>
		<div><label class = "dragup">본&nbsp;&nbsp;&nbsp;&nbsp;문</label> <span id = "bonmun">시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!시간은 금이라구 친구!시간은 금이라구 친구!
																				시간은 금이라구 친구!</span></div>
		</div></div>

		<footer>
			<hr>
			<p>copyright &copy; 2018. ronaldotree <sup>&reg;</sup>. all rights reserved.</p>
		</footer>
		
	</body>
</html>