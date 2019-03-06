<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

a{
	text-decoration: none;
}

</style>
</head>
<body>
	<h1>上传文件功能</h1>
	<form action="<%=basePath %>UploadServlet" method="post" enctype="multipart/form-data">
		<input type="file" class="file1" name="file1">
		<button type="submit" class="but1">上传</button>
	</form>
</body>
</html>