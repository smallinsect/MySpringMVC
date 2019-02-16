<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="<%=basePath %>jquery/jquery.js"></script>
	<script type="text/javascript">
		var dataparams = {
				liveid: "F7DBF34D866E9AEC",//直播id
				pageindex: "1",//页码
				pagenum: "50"//每页显示的个数
		};
		$.ajax({
			async: true,
			type: "get",
			url: "<%=basePath %>statisLiveUseraction",
			data: dataparams,
			dataType: "json",
			success: function(data){
				if(data){
					$("#divmsg").append(JSON.stringify(data));
				}
			}
		});
	</script>
</head>
<body>
	<h1>获取观看直播的访问记录</h1>
	<div id="divmsg"></div>
</body>
</html>