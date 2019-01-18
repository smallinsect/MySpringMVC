<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>批量显示视频信息</title>
	<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.7.0/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.7.0/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../test-css/test.css">
	<script type="text/javascript" src="../jquery-easyui-1.7.0/jquery.min.js"></script>
	<script type="text/javascript" src="../jquery-easyui-1.7.0/jquery.easyui.min.js"></script>
<script type="text/javascript">
$(function () {
	$("#datagrid").datagrid({
		method:"get",
		url:"<%=basePath%>getVideoDataGrid",
		//fixed: true,
		fitColumns: true,
		pagination: true,//分页显示
		pageNumber: 1,//初始页码
		pageSize: 20,//初始化页面大小
		pageList: [20, 40, 60, 80, 100],//页面大小列表
		columns: [[
			{title:'视频标题',field:'title',width:80},
			{title:'视频时长',field:'duration',width:80,
				formatter: function(value,row,index){
					var s=value%60%60;
					value=Math.floor(value/60);
					var m=value%60;
					value=Math.floor(value/60);
					var h=value;
					return h+":"+m+":"+s;
				}
			},
			{title:'视频截图地址',field:'image',width:80,
				formatter: function(value,row,index){
					return '<img src="'+value+'">';
				}
			},
			{title:'占用空间',field:'totalsize',width:80,
				formatter: function(value,row,index){
					var num=value/1024/1024;
					return num.toFixed(1)+"M";
				}
			},
			{title:'上传时间',field:'uploadtime',width:80},
		]]
	});
	
});

</script>
</head>
<body>
	<h2>批量显示视频信息</h2>
	<div style="margin:20px 0;"></div>
	
	<table class="easyui-datagrid" id="datagrid" style="width:1000px;height:800px" data-options="singleSelect:true">
		<thead>
			<tr>
				<th data-options="field:'title',width:80">视频标题</th>
				<th data-options="field:'duration',width:80">视频时长</th>
				<th data-options="field:'image',width:80">视频截图地址</th>
				<th data-options="field:'totalsize',width:80">视频截图地址</th>
				<th data-options="field:'uploadtime',width:80">上传时间</th>
			</tr>
		</thead>
	</table>
	
</body>
</html>