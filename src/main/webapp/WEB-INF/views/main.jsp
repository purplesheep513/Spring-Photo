<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/main.css">
</head>

<body>
	<div class="main_container">
		<section class="side_bar">
			<div class="profile_container">
				<div class="user_photo">
					<img src="<%=request.getContextPath()%>/static/images/profile.png">
				</div>
				<div class="user_info">
					<span class="user_name">양보라</span> <span class="user_email">purplesheep7347@gmail.com</span>
				</div>
				<div class="photo_area"></div>
				<div class="write_area">
					<textarea name="board" id="photo_area" cols="30" rows="10"></textarea>
				</div>
				<input type="button" class="send" id="send" value="send">
				<div class="log_out">
					<img src="<%=request.getContextPath()%>/static/images/logout.png">logout
				</div>
			</div>
		</section>
		<section class="post_content"></section>
	</div>
</body>

</html>