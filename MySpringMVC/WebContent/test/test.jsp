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
<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.7.0/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.7.0/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../test-css/test.css">
<script type="text/javascript" src="../jquery-easyui-1.7.0/jquery.min.js"></script>
<script type="text/javascript" src="../jquery-easyui-1.7.0/jquery.easyui.min.js"></script>

<script type="text/javascript">

$(document).ready(function(){
	var data = {
// 			userid: "DD8B0F0F73EC5B29",
// 			format: "json"
		videoid: "呵呵呵"
	};

	$.ajax({
		async: true,
		type: "get",
		url: "<%=basePath%>getUserInfo",
		data : data,
		dataType : "json",
// 		contentType:'application/json;charset=UTF-8',
		success : function(data) {
			if(data){
				$('#account').textbox('setValue',data.user.account);
				$('#version').textbox('setValue',data.user.version);
				$('#expired').textbox('setValue',data.user.expired);
				
				$('#space-total').textbox('setValue',data.user.space.total);
				$('#space-remain').textbox('setValue',data.user.space.remain);
				$('#space-used').textbox('setValue',data.user.space.used);
				
				$('#traffic-total').textbox('setValue',data.user.traffic.total);
				$('#traffic-remain').textbox('setValue',data.user.traffic.remain);
				$('#traffic-used').textbox('setValue',data.user.traffic.used);
			}
			console.log(data);
		},
		error : function(data) {
			console.log(data);
		}
	});

});
</script>
</head>
<body>
	<h2>用户基本信息</h2>
<!-- 	<p>The textbox allows a user to enter information.</p> -->
	<div style="margin:10px 0;"></div>
	<div class="easyui-panel" title="信息" style="width:100%;max-width:400px;padding:10px 10px;">
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="用户账户：" id="account" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="版本信息："  id="version" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="到期时间："  id="expired" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="用户空间总量（G）："  id="space-total" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="用户空间剩余总量（G）："  id="space-remain" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="用户空间使用总量（G）："  id="space-used" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="用户流量总量（G）："  id="traffic-total" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="用户剩余流量大小（G）："  id="traffic-remain" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="用户已使用流量⼤小（G）"  id="traffic-used" labelPosition="top" data-options="readonly: true" style="width:100%;">
		</div>
		
<!-- 		<div> -->
<!-- 			<a href="#" class="easyui-linkbutton" iconCls="icon-ok" style="width:100%;height:32px">Register</a> -->
<!-- 		</div> -->
	</div>
</body>
</html>