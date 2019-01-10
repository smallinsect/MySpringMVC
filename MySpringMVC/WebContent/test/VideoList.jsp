<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
$(function () {
	$("#datagrid").datagrid({
		method:"get",
		url:"<%=basePath%>getVideoList",
		columns:[[
			{name:'视频列表ID',field:'id',width:80},
			{name:'视频列表名称',field:'name',width:80},
			{name:'视频数量',field:'videocount',width:80},
			{name:'分类ID',field:'categoryid',width:80},
		]]
	});
});

</script>
</head>
<body>
	<h2>视频列表</h2>
	<div style="margin:20px 0;"></div>
	
	<table class="easyui-datagrid" id="datagrid" title="Basic DataGrid" style="width:700px;height:250px"
			data-options="singleSelect:true,collapsible:true">
		<thead>
			<tr>
				<th data-options="field:'id',width:80">视频列表ID</th>
				<th data-options="field:'name',width:80">视频列表名称</th>
				<th data-options="field:'videocount',width:80">视频数量</th>
				<th data-options="field:'categoryid',width:80">分类ID</th>
			</tr>
		</thead>
	</table>

</body>
</html>
