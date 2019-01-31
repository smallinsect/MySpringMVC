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
				roomids: "27C5073749A609BE9C33DC5901307461,9DB6A44BD47394819C33DC5901307461"//直播间id（以英文逗号,区分)，批量查询直播间数量不能超过100个
		};
		$.ajax({
			async: true,
			type: "get",
			url: "<%=basePath %>roomsPublishing",
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
	<h1>获取直播间直播状态</h1>
	<div id="divmsg"></div>
</body>
</html>