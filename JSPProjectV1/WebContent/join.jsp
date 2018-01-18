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
			#joinfrm {width : 400px; margin:0 auto; padding-top : 85px;}
			#joinfrm label{display : inline-block; width : 120px; text-align : right;}
			#joinfrm div{margin : 7px 0;}
			/* button[type=submit]{margin-left:125px;} */
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
		<h1>회원가입</h1>
		<form id = "joinfrm" method="post" action="joinok.jsp">
		<div id = "joinfrm">
		<div id="contents">
		<div><label>아이디</label><input type="text" name="uid" required="required"></div>
		<div><label>비밀번호</label><input type="text" name="pwd" required="required"></div>
		<div><label>비밀번호 확인</label><input type="text" name="repwd" required="required"></div>
		<div><label>이름</label><input type="text" name="name" required="required"></div>		
		<label></label><button type="submit">입력완료</button><button type="reset">다시입력</button></div>
		</div>
		</form>
		
		<footer>
			<hr>
			<p>copyright &copy; 2018. ronaldotree <sup>&reg;</sup>. all rights reserved.</p>
		</footer>
		
		<script>
			var joinfrm = document.getElementById("joinfrm");
			joinfrm.onsubmit = checkjoin; // 이벤트 등록
			var uid = document.getElementById("uid"); // 아이디
			var uid = document.getElementById("pwd"); // 비밀번호
			var uid = document.getElementById("repwd"); // 비밀번호 확인
			var uid = document.getElementById("name"); // 이름
			
			function checkjoin(){
				if(uid.value ==""){ 
					alert("아이디를 입력하세요!");
					uid.focus();
				}else if(pwd.value ==""){
					alert("비밀번호를 입력하세요!");
					pwd.focus();
				}else if(pwd.value != repwd.value){
					alert("비밀번호가 일치하지 않습니다!");
					pwd.focus();
				}else if(name.value ==""){
					alert("이름을 입력하세요!");
					name.focus();
				}else{
					return true;	// submit 기능 동작
				}
				return false; // submit 기능 중지
			}
		</script>
		
	</body>
</html>