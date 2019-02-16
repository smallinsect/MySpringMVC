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
				starttime: "2019-01-01 12:30:00",//查询起始时间 必须，格式：yyyy-MM-dd HH:mm:ss ，例："2015-01-01 12:30:00"
				endtime: "2019-01-31 12:30:00",//查询截止时间 必须，格式：yyyy-MM-dd HH:mm:ss ，endtime和starttime相差不能超过30天
				action: "0",//按登录或退出行为类型查询，0表示登录，1表示退出
				pageindex: "1",//页码
				pagenum: "50"//每页显示的个数
		};
		$.ajax({
			async: true,
			type: "get",
			url: "<%=basePath %>statisUserRecordUseraction",
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
	<h1>获取所有直播回放的观看统计信息</h1>
	<div id="divmsg"></div>
</body>
</html>