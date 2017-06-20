<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加课程</title>
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
					添加课程
				</div>
			</div>
		</div>
	</div>
	
	<div class="row" style="margin-top:100px;align:center">
		<div class="col-sm-offset-4 col-sm-4" style="background:#eee;width:500px;border-radius:8px;box-shadow:5px 5px 5px #333">
			<form action="AddCourseServlet" method="post" class="form-horizontal" role="form" >
				<div class="form-group">
					<div class="col-sm-12" style="margin-top:15px;">
						<input type="text" id="courseName" name="courseName" class="form-control" placeholder="请输入课程名">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="courseDate" name="courseDate" class="form-control" placeholder="请输入上课时间(比如:周一8:15~9:15)">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="address" name="address" class="form-control" placeholder="请输入上课地点">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="courseTea" name="courseTea" class="form-control" placeholder="请输入授课老师">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="courseWeek" name="courseWeek" class="form-control" placeholder="请输入上课周次">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="college" name="college" class="form-control" placeholder="请输入所属学院">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="major" name="major" class="form-control" placeholder="请输入所属学院的专业">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-primary" class="form-control" style="width:100%" >添加</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>