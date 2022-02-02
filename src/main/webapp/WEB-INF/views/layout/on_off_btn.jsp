<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/static/css/on_off_btn.css">
</head>
<body>
	<section title=".slideThree">
		<div class="mode">
			<span>day mode</span>
		</div>
		<div class="slideThree">
			<input type="checkbox" value="None" id="slideThree" name="check"
				checked /> <label for="slideThree"></label>
		</div>
	</section>
</body>
</html>