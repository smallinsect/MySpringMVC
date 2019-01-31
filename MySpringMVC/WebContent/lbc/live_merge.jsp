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
				roomid: "",//直播间id,必须
				recordids:""//回放ID集合,必须，中间以英文逗号间隔，最多支持3个回放合并
		};
		$.ajax({
			async: true,
			type: "get",
			url: "<%=basePath %>v2RecordSearch",
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
	<h1>合并回放接口</h1>
	<div id="divmsg"></div>
</body>
</html>