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
				roomid: "27C5073749A609BE9C33DC5901307461",//直播间id
				starttime: "2015-01-02 13:30:00",//开始时间，精确到秒，例："2015-01-02 12:30:00"
				endtime: "2019-01-31 13:30:00"//结束时间，精确到秒，例："2015-01-02 13:30:00"
		};
		$.ajax({
			async: true,
			type: "get",
			url: "<%=basePath %>statisConnections",
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
	<h1>获取直播间连接数</h1>
	<div id="divmsg"></div>
</body>
</html>