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
	<link rel="stylesheet" type="text/css" href="../cod-css/cod.css">
	<script type="text/javascript" src="../jquery-easyui-1.7.0/jquery.min.js"></script>
	<script type="text/javascript" src="../jquery-easyui-1.7.0/jquery.easyui.min.js"></script>
<script type="text/javascript">
$(function () {
// 	$("#datagrid").datagrid({
// 		method:"get",
<%-- 		url:"<%=basePath%>getRoomInfoDataGrid", --%>
// 		fixed: true,
// 		fitColumns: true,
// 		columns:[[
// 			{title:'视频标题',field:'title',width:80},
// 			{title:'视频时长',field:'duration',width:80,
// 				formatter: function(value,row,index){
// 					var s=value%60%60;
// 					value=Math.floor(value/60);
// 					var m=value%60;
// 					value=Math.floor(value/60);
// 					var h=value;
// 					return h+":"+m+":"+s;
// 				}
// 			},
// 			{title:'视频截图地址',field:'image',width:80,
// 				formatter: function(value,row,index){
// 					return '<img src="'+value+'">';
// 				}
// 			},
// 			{title:'占用空间',field:'totalsize',width:80,
// 				formatter: function(value,row,index){
// 					var num=value/1024/1024;
// 					return num.toFixed(1)+"M";
// 				}
// 			},
// 			{title:'上传时间',field:'uploadtime',width:80},
// 		]]
// 	});
	var dataparams = {
			pagenum: 50,
			pageindex: 1
	};
	$.ajax({
		async: true,
		type: "get",
		url: "<%=basePath%>roomInfo",
		data: dataparams,
		dataType: "json",
		success: function(data){
			if(data){
				$("#divmsg").append(JSON.stringify(data));
			}
		},
		error: function(data){
			
		}
	});
});

</script>
</head>
<body>
<!-- 	<h2>视频列表</h2> -->
<!-- 	<div style="margin:20px 0;"></div> -->
	
<!-- 	<table class="easyui-datagrid" id="datagrid" style="width:1000px;height:800px" -->
<!-- 			data-options="singleSelect:true,collapsible:true"> -->
<!-- 		<thead> -->
<!-- 			<tr> -->
<!-- 				<th data-options="field:'id',width:80">视频列表ID</th> -->
<!-- 				<th data-options="field:'name',width:80">视频列表名称</th> -->
<!-- 				<th data-options="field:'videocount',width:80">视频数量</th> -->
<!-- 				<th data-options="field:'categoryid',width:80">分类ID</th> -->
<!-- 			</tr> -->
<!-- 		</thead> -->
<!-- 	</table> -->
	<div id="divmsg"></div>
</body>
</html>