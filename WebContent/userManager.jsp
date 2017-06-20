<%@ page import="com.xxx.courseArr.bean.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.xxx.courseArr.dao.*" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理中心</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-3.2.1.min.js"> </script>
<script src="js/bootstrap.min.js"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>

<body>
	<a name="top">
		<div id="page">
		<div class="navbar navbar-default navbar-fixed-top" style="background:#272727;color:white" >
		<div class="container">
			<div class="row" style="font-size:20px;margin-top:10px;">
				<div class="col-sm-12">
					用户管理
					
				</div>
				
			</div>
			<div id="title" style="margin-top:-40px">
					<form action="SelectUserServlet" method="post">
						<div class="col search">
							<input type="submit" style="width:50px;height: 30px;margin-top:-10px;border-radius:8px;font-size: 14px;font-weight: bold;" value="搜索">
						</div>
						<div class="col"><input type="text" name="author"  placeholder="请输入用户名" style="width:200px;height: 30px;margin-top:-10px;border-radius:8px;padding:0 4px;"></div>
					</form>
			</div>
		</div>
	</div>
			<div id="logo" style="text-align:center; padding-top:15px">
				<%--<img src="images/logo.jpg"> --%>
			</div>
			
			<table id="table" bordercolor="#99CCFF" border='1px' cellspacing='0px'>
				<tr bgcolor="#e4eef9" height="36px">
					<th>userId</th>
					<th>学号</th>
					<th>用户名</th>
					<th>用户密码</th>
					<th>手机号</th>
					<th>邮箱</th>
					<th>删除</th>
				</tr>
			 <c:forEach var="user" items="${userList }"> 
					<tr height="36px">
						<th>${user.userId }</th> 
						<th>${user.studentNum }</th>
						<th>${user.username }</th>
						<th>${user.password }</th>
						<th>${user.phone }</th>
						<th>${user.email }</th>
						<th><a href="DelUserServlet?userId=${user.userId }">删除</a></th>
					</tr>
				</c:forEach> 
			</table>
			<div>
				<ul class="p2">
					<li class="p2"><a href="#top">返回顶部</a></li>
				</ul>
			</div>
			<div id="p3">
				<p>CopyRight&nbsp;:&copy;&nbsp;yanmin&nbsp;&nbsp;2017,All Rights Reserved</p>
			</div>
		</div>
	</a>

</body>
</html>