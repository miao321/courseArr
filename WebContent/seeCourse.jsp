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
<title>查看课表</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-3.2.1.min.js"> </script>
<script src="js/bootstrap.min.js"> </script>
<script src="js/script.js" type="text/javascript"> </script>
</head>
<body>
	<table id="table" bordercolor="#99CCFF" border='1px' cellspacing='0px'>
				<tr bgcolor="#e4eef9" height="36px">
					<th>上课节数</th>
					<th>星期一</th>
					<th>星期二</th>
					<th>星期三</th>
					<th>星期四</th>
					<th>星期五</th>
					<th>星期六</th>
					<th>星期日</th>
				</tr>
			 	 <c:forEach var="course" items="${courseList }"> 
					<tr height="36px">
						<th>1</th>
						<th>
						<td>${course.courseName }<br/>${course.courseDate}<br>${course.address }<br>${course.courseTea}</td> 
						</th>
					
						
						<th>${user.username }</th>
						<th>${user.password }</th>
						<th>${user.phone }</th>
						<th>${user.email }</th>
						<th><a href="DelUserServlet?userId=${user.userId }">删除</a></th>
					</tr>
					
					
				</c:forEach>
				<%-- <c:forEach varStatus="status"> 
				<% for(int j=0;j<13;j++){%>
					
				<tr bgcolor="#e4eef9" height="36px">
					
					<% for(int i=0;i<8;i++){%>
					<th>${status.index + 1}</th>
					<th><a href="addCourseList.jsp"><span style="font-size: 20px;font-weight: bold;">+</span></a></th>
					<%} %>
				</tr>
				<%} %>
				</c:forEach> --%>
			</table>
</body>
</html>