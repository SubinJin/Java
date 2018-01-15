<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
	<head>
		<meta charset="UTF-8">
		<title>JSP 프로젝트 V1</title>
				<style>
			body{width:950px; margin: 0 auto;}
			/* 본문영역의 크기를 적당하게 조절, 가운데 정렬*/
			a:link{text-decoration: none; color : black; font-weight:bold}
			a:visited{color : black}
			a:hover{text-decoration : underline; color : green}
			a:active{color : red}
			/* 하이퍼링크에 대한 디자인 적용*/
			ul{list-style-type:none; padding-bottom: 10px}
			ul li{float:left; padding-left:3em}
			/* 상단 메뉴 디자인 */
			hr{border:1px solid black; clear: both;}
			/* hr 태그 디자인 */
			p{text-align:center;}
			/* 꼬릿말 영역 텍스트 정렬 */
			#contents{min-height:550px;}
			/* 본문영역 디자인 */
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
		<div>아이디<input type="text" name="uid" required="required"></div>
		<div>비밀번호<input type="text" name="pwd" required="required"></div>
		<div id="contents"><button type="submit">로그인</button></div>
		<footer>
			<hr>
			<p>copyright &copy; 2018. ronaldotree <sup>&reg;</sup>. all rights reserved.</p>
		</footer>
		
	</body>
</html>