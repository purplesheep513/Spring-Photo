<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>로그인 페이지</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/static/css/signinPage.css">
<%@include file="jsp/common.jsp"%>


</head>
<body>
	<main class="main_container">
		<!-- 로그인 폼 -->
		<section class="first_section sign_in" id="signin_section">
			<div class="form_type">
				<h2>Welcome!</h2>
			</div>
			<div class="form_wrapper">
				<form id="login_form">
					<div class="form_type h40px">
						<input class="w80 h25px" type="text" name="signinId" id="signinId"
							placeholder="id를 입력하세요">
					</div>
					<div class="form_type h40px">
						<input class="w80 h25px" type="password" name="signinPassword"
							id="signinPassword" placeholder="password를 입력하세요">
					</div>
				</form>
				<div class="form_btn pdt21">
					<button class="comm_btn" id="signin_btn" type="button">sign
						in</button>
				</div>
				<div class="form_type">
					<span class="mouse_hover" id="signup_btn">sign up</span> <span>/</span>
					<span class="mouse_hover" id="find_password_btn">forgot
						password?</span>
				</div>
			</div>
		</section>

		<!-- 회원가입폼  -->
		<section class="first_section sign_up" id="signup_section"
			style="display: none;">
			<form>
				<div class="form_type form_signup">
					<label for="userId" class="required">*</label> <input type="text"
						name="userId" id="userId" class="mendatory"
						placeholder="id를 입력하세요">
				</div>
				<div class="form_type form_signup">
					<input type="text" name="userName" id="userName"
						placeholder="닉네임을 입력하세요">
				</div>
				<div class="form_type form_signup">
					<label for="userName" class="required">*</label> <input
						type="password" name="userPassword" id="userPassword"
						class="mendatory" placeholder="password를 입력하세요">
				</div>
				<div class="form_type form_signup">
					<label for="userName" class="required">*</label> <input
						type="password" name="userPassword_check" id="userPassword_check"
						class="mendatory" placeholder="password를 확인하세요">
				</div>
				<div class="form_type form_signup">
					<label for="userName" class="required">*</label> <input type="text"
						name="userEmail" id="userEmail" class="mendatory"
						placeholder="이메일을 입력하세요">
				</div>
			</form>
			<div class="form_btn w70 mgt10px">
				<button class="comm_btn" id="regist_user" type="button">sign
					up</button>
			</div>
			<img id="redirection"
				src="<%=request.getContextPath()%>/static/images/redirection.png">
		</section>

		<!-- 이미지 폼 -->
		<section class="second_section sign_in" id="signin_section2">
			<h1>Moon Light</h1>
			<h6>share your happy moments with us!</h6>
			<div class="img_container" id="paper_plane">
				<img
					src="<%=request.getContextPath()%>/static/images/paper_plane.png">
			</div>
			<div class="img_container_cloud1">
				<img src="<%=request.getContextPath()%>/static/images/cloud1.png">
			</div>
			<div class="img_container_cloud2" id="">
				<img src="<%=request.getContextPath()%>/static/images/cloud2.png">
			</div>
			<div class="img_container_cloud3">
				<img src="<%=request.getContextPath()%>/static/images/cloud3.png">
			</div>
		</section>
		<%@include file="layout/on_off_btn.jsp"%>
	</main>
</body>
<script src="<%=request.getContextPath()%>/static/js/signinPage.js"></script>
</html>