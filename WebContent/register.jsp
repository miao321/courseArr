<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>注册</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

<script src="js/jquery-3.2.1.min.js" type="text/javascript"> </script>
<script src="js/script.js" type="text/javascript"> </script>
<script src="js/keyEvent.js" type="text/javascript"> </script>
<script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</head>
<body onkeydown="keyLogin();">
	<div class="navbar navbar-default navbar-fixed-top" style="background:#272727;color:white">
		<div class="container">
			<div class="row" style="font-size:20px;margin-top:10px;">
				<div class="col-sm-12">
					注册
				</div>
			</div>
		</div>
	</div>
	
	<div class="row" style="margin-top:100px;align:center">
		<div class="col-sm-offset-4 col-sm-4" style="background:#eee;width:500px;border-radius:8px;box-shadow:5px 5px 5px #333">
			<form action="RegisterServlet" method="post" class="form-horizontal" role="form" >
				<div class="form-group">
					<div class="col-sm-12" style="margin-top:15px;">
						<input type="text" id="studentNum" name="studentNum" class="form-control" placeholder="请输入学号">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12" style="margin-top:15px;">
						<input type="text" id="username" name="username" class="form-control" placeholder="请输入姓名">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="password" name="password" class="form-control" placeholder="请输入密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="confirmPassword" name="confirmPassword" class="form-control" placeholder="请再次输入密码">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="phone" name="phone" class="form-control" placeholder="请输入手机号">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="email" name="email" class="form-control" placeholder="请输入邮箱">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-primary" class="form-control" style="width:100%" >注册</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>