<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>moonlight</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/static/css/on_off_btn.css">
</head>
<style>
* {
	margin: 0;
	padding: 0;
}

.light_mode .background {
	background: linear-gradient(to bottom right, #FEFFEA, #7FC8F3);
}

.dark_mode .background {
	background: linear-gradient(to bottom right, #9A3E22, #591B5E);
}

#content {
	margin-top: 20px;
	width: 77%;
	height: 80%;
	border: none;
}

.light_mode #content {
	box-shadow: 10px 10px 30px rgba(100, 100, 100, 0.1);
}

.dark_mode #content {
	box-shadow: 10px 10px 30px rgba(46, 7, 3, 0.2);
}
</style>

<body style="overflow: hidden">
	<div id="background_container" class="light_mode"
		style="width: 100%; height: 100vh; text-align: center;">
		<div class="background"
			style="float: left; width: 100%; height: 100%;">
			<section title=".slideThree">
				<div class="mode">
					<span>day mode</span>
				</div>
				<div class="slideThree">
					<input type="checkbox" value="None" id="slideThree" name="check"
						checked /> <label for="slideThree"></label>
				</div>
			</section>
 			<iframe id="content" scrolling="no"
				src="<%=request.getContextPath() %>/static/jsp/signinPage.jsp"></iframe>
		</div>
	</div>
</body>
<%@include file="jsp/common.jsp" %>
</html>
<script>
	$(document).ready(function() {
		let mode_btn = document.getElementById("slideThree");

		mode_btn.onclick = function() {
			let container = document.getElementById("background_container");
			if (container.classList.contains("light_mode")) {//라이트 모드가 켜져있는 경우
				container.classList.remove("light_mode");
				container.classList.add("dark_mode");
			} else {
				container.classList.remove("dark_mode");
				container.classList.add("light_mode");
			}
		}
	});
</script>