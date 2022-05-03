<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
	<form name="frm" action="StudentGetServlet" method="post">
		<input type="hidden" name="cmd" value="search"> 
		number:<input type="number" name="user_id" value="300"><br>
		Name:<input type="text" name="user_name" value="gildong"><br> 
		Eng:<input type="number" name="eng_score"><br>
		Kor:<input type="number" name="kor_score"><br>
		
		<input type="submit" value="조회"> 
		<input id = "addBtn" type="button" value="입력">
		<input id = "modBtn" type="button" value="수정"> 
		<input id = "delBtn" type="button" value="삭제">
	</form>
	<hr>
	<a href = "studentList.jsp">전체리스트 보기</a>
	<form name="refrm"></form>
	<script>
		let modBtn = document.getElementById('modBtn');
		modBtn.addEventListener('click', function(){
			let frm = document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "mod";
			frm.submit();
		})
	
	let delBtn = document.getElementById('delBtn');
		delBtn.addEventListener('click', function(){
			let frm = document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "del";
			frm.submit();
		
		})
	
	
	
	
		let btn = document.querySelector('#addBtn');
		btn.addEventListener('click', function() {
			let frm = document.forms.frm;
			console.log(frm);
			frm.action = "StudentGetServlet";
			frm.method = "post";
			frm.cmd.value = "add";
			
			frm.submit();//form의 submit
		})


	</script>
</body>
</html>