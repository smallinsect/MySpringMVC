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
				roomid: "CB385E74EBCA4F449C33DC5901307461",//直播间ID
				pagenum: "50",//每页显示的个数
				pageindex: "1",//页码
				starttime: "2015-01-01 00:00:00",//查询起始时间,如需按时间范围查询可添加该参数和下面的endtime参数，该查询是按直播的开始时间作为查询条件的。
				endtime: "2019-01-31 00:00:00",//查询截止时间
				liveid: ""//直播id,可选，将只查询该直播下的回放信息
		};
		$.ajax({
			async: true,
			type: "get",
			url: "<%=basePath %>v2RecordInfo",
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
	<h1>查询回放列表</h1>
	<div id="divmsg"></div>
</body>
</html>