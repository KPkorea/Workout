<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<title>Login</title>
<style type="text/css">
body{
   margin: 0;
   padding: 0;
   background-image: url("/img/login.jpg");
   background-size: inherit;
   background-repeat: no-repeat;
}

.login-box{
   margin: 0 auto;
   width: 363px;
   height: 300px;
   text-align: center;
/*    background-color: gray; */
  	margin-top: 30vh;
}

.login-form{
   width: 363px;
   margin-top: 20px;
}

.login-form input{
   margin: 3px;
   width: 180px;
   height: 35px;
   border: 0px;
   font-weight: bold;
   color: green;
}

.login-form button{
   margin: 3px;
   width: 185px;
   height: 35px;
   background-color: green;
   color: white; 
   font-weight: bold;
}
</style>
<script type="text/javascript">
$(function(){
	$(".login").click(function(){
		if( $("#id").val() == "" || $("#id").val().length < 4 ){
			alert("올바른 아이디를 입력하세요");
			$("#id").focus();
			return false;
		}
		if( $("#pw").val() == "" || $("#pw").val().length < 4 ){
			alert("올바른 암호를 입력하세요");
			$("#pw").focus();
			return false;
		}
		//잘 통과했다면.
		if(confirm("로그인 하시겠습니까?")){
			form.submit();
		}
		
	});	
});
</script>
</head>
<body>
	<div class="container">
		<div class="aticle">
			<div class="login-box">
				<div class="login-form">
					<img alt="" src="/img/robot.png" width="200px;">
					<form action="login" name="form" method="post">
						<input type="text" name="id" id="id" required="required" maxlength="15"> 
							<input type="password" name="pw" id="pw" required="required" maxlength="20">
						<button type="button" class="login">LOGIN</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>