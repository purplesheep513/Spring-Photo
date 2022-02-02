/*******************************************************/
/*										POST AJAX												 */
/*******************************************************/
function comm_postAjax(param) {
	$.ajax({
		type: "POST",
		url: param.url,
		data: JSON.stringify(param.data),
		contentType: "application/json; charset=utf-8",
		dataType : "json" // 응답 데이터
	}).done(function(response) {// 성공시
	    console.log(response)
		param.success();
	}).fail(function(error) {// fail시
		param.fail();
		toastr.error(JSON.stringify(error));
	});
}

/*******************************************************/
/*											GET AJAX												 */
/*******************************************************/
function comm_getAjax(data) {
	$.ajax({
		type: "GET",
		url: data.url,
		param: data.data,
		contentType: "applicagtion/json; charset=utf-8",
		dataType: "json" // 응답 데이터
	}).done(function(data) {
		
	}).fail(function(data) {

	});
}

/*******************************************************/
/*													NVL												 */
/*******************************************************/
function comm_nvl(param, to) {
	let val = param;
	if (typeof val == 'undefined' || val == "" || val == null || val == undefined) {
		val = to;
	}
	return val;
}
