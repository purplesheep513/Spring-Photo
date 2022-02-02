$(document).ready(function() {
	let signup_btn = document.getElementById("signup_btn");
	let find_password_btn = document.getElementById("find_password_btn");
	let redirection = document.getElementById("redirection");

	// 이미지 default 위치
	const default_location = {
		img_left: $(".img_container").css("left"),
		img_top: $(".img_container").css("top"),
		img1_left: $(".img_container_cloud1").css("left"),
		img1_top: $(".img_container_cloud1").css("top"),
		img2_left: $(".img_container_cloud2").css("left"),
		img2_top: $(".img_container_cloud2").css("top"),
		img3_left: $(".img_container_cloud3").css("left"),
		img3_top: $(".img_container_cloud3").css("top"),
	}

	// 세션 존재 시 main으로 연결 존재하지 않으면 로그인/회원가입페이지에 머무름
	sessionCheck();
	
	// 비밀번호 찾기 기능 이후에 추가
	find_password_btn.onclick = () => {
		toastr.success('준비중입니다.');
	}

	// 로그인 회원가입 api 
	api.init();

	//회원가입 버튼 눌렀을 때 div열기
	signup_btn.onclick = () => {
		click_signup(default_location);
	}

	// 뒤로가기 눌렀을 때 div 닫기
	redirection.onclick = () => {
		back_signin(default_location);
	}
});
/*******************************************************/
/*										로그인/회원가입											 */
/*******************************************************/
// 1. id가 중복인지 아닌지 체크
// 2. password 두개가 일치하는 지 체크
// 3. 필수값을 전부 입력했는 지 체크

let api = {
	init: function() {
		//회원가입
		$("#regist_user").on("click", () => {
			this.signup();
		});
		//로그인
		$("#signin_btn").on("click", () => {
			this.signin();
		});
	},
	signup: function() {
		//if(!validate_id()){
		//	toastr.error("아이디가 중복됩니다.");
		//}
		if (!validate_password()) {
			toastr.error("비밀번호를 확인해주세요.");
			return false;
		}
		if (comm_nvl(validate_required(), '') != '') { // 필수값 체크
			toastr.error(validate_required());
		}
		let user_data = {
			userId: $("#userId").val(),
			userName: $("#userName").val(),
			userPassword: $("#userPassword").val(),
			userEmail: $("#userEmail").val()
		};

		let param = {
			url: "/purplesheep/api/user",
			data: user_data,
			success: function() {
				toastr.success("회원가입이 완료되었습니다");
				location.href = "/purplesheep/main"
			},
			fail: function() {
				toastr.error("회원가입에 실패했습니다.");
			}
		};
		comm_postAjax(param);
	},
	signin: function() {
		let user_data = {
			userId: $("#signinId").val(),
			userPassword: $("#signinPassword").val(),
		};

		let param = {
			url: "/purplesheep/api/signin",
			data: user_data,
			success: function() {
				location.href = "/purplesheep/main"
			},
			fail: function() {
				toastr.error("로그인에 실패했습니다.");
			}
		};
		comm_postAjax(param);
	}
};

/*******************************************************/
/*											validation												 */
/*******************************************************/
function validate_id() { // id 중복 체크
	let check = true;
	$.ajax({
		url: "/purplesheep/main",
		type: "GET"
	}).done(function(data) {
		if (data.length > 0) {
			check = false;
		}
	});
	return check;
}
function validate_password() {// password가 일치하는 지 체크
	let check = true;
	let pass = document.getElementById("userPassword");
	let pass_check = document.getElementById("userPassword_check");

	if (comm_nvl(pass.value, '') != comm_nvl(pass_check.value, '')) {
		check = false;
	}
	return check;
}
function validate_required() {
	let matches = document.getElementsByClassName("mendatory");
	let check;

	for (let i = 0; i < matches.length; i++) {
		if (comm_nvl(matches[i].value, '') == '') {
			check = matches[i].placeholder
			break;
		}
	}
	return check;
}

/*******************************************************/
/*										회원가입 버튼클릭										 */
/*******************************************************/
function click_signup(param) {
	$("#signin_section").animate({
		width: "70%",
	})
	$("#signin_section2").animate({
		width: "50%"
	});
	$("#signup_section").animate({
		width: "50%",
	})
	$("#signup_section").css({ display: "block" })
	$("#signin_section").css({ display: "none" })
	$(".img_container").animate({
		left: "+=" + (parseInt(param.img_left) - 650) + "px",
		top: "+=" + (parseInt(param.img_top) - 50) + "px"
	})
	$(".img_container_cloud1").animate({
		left: "+=" + (parseInt(param.img1_left) - 500) + "px",
		top: "+=" + (parseInt(param.img1_top)) + "px"
	})
	$(".img_container_cloud2").animate({
		left: "-=" + (parseInt(param.img2_left) - 1000) + "px",
		top: "+=" + (parseInt(param.img2_top) - 20) + "px"
	})
	$(".img_container_cloud3").animate({
		left: "-=" + (parseInt(param.img3_left) - 800) + "px",
		top: "+=" + (parseInt(param.img2_top) - 200) + "px"
	})

	$(".img_container img").animate({
		width: "150%"
	})
	$(".img_container_cloud2 img").animate({
		width: "100%"
	})

	$("h1").fadeOut(200, function() {
		$(this).html("Join us!").fadeIn(500);
	});
	$("h6").fadeOut(200, function() {
		$(this).html("And show us your talent :D").fadeIn(500);
	});
};
/*******************************************************/
/*									로그인화면으로 돌아가기									 */
/*******************************************************/
function back_signin(param) {
	$("#signin_section").css({ display: "block" })
	$("#signin_section2").animate({
		width: "70%"
	});
	$("#signin_section").animate({
		width: "30%",
	})
	$("#signup_section").animate({
		width: "30%",
	})
	$("#signup_section").css({ display: "none" })

	$(".img_container").animate({
		left: parseInt(param.img_left) + "px",
		top: parseInt(param.img_top) + "px"
	})
	$(".img_container_cloud1").animate({
		left: parseInt(param.img1_left) + "px",
		top: parseInt(param.img1_top) + "px"
	})
	$(".img_container_cloud2").animate({
		left: parseInt(param.img2_left) + "px",
		top: parseInt(param.img2_top) + "px"
	})
	$(".img_container_cloud3").animate({
		left: parseInt(param.img3_left) + "px",
		top: parseInt(param.img3_top) + "px"
	})

	$(".img_container img").animate({
		width: "50%",
	});
	$(".img_container_cloud2 img").animate({
		width: "70%",
	});
	$("h1").fadeOut(200, function() {
		$(this).html("Moon Light").fadeIn(500);
	});
	$("h6").fadeOut(200, function() {
		$(this).html("share your happy moments with us!").fadeIn(500);
	});
}

/*******************************************************/
/*											세션유무 체크											 */
/*******************************************************/
function sessionCheck() {
	var uid = '<%=(String)session.getAttribute("principal")%>';

	if (uid != "null"){
		location.replace("/purplesheep/main");
	}
}
