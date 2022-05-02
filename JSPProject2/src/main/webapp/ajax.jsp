<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		//Asynchronous JavaScript And Xml
		let url = 'StudentGetServlet';
		fetch(url)
			.then(result =>{
				console.log(result);
				return result.json();
			})
			.then(result => {
				console.log(result);
			})
			.catch(error => {
				console.log(error);
			})
		
		
	</script>
</body>
</html>