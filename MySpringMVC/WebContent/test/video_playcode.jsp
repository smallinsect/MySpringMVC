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
<title>Insert title here</title>
<script type="text/javascript" src="../jquery/jquery.js"></script>
<script type="text/javascript">

$(function () {
	$.ajax({
		async: true,
		type: "get",
		url: "<%=basePath%>getVideoPlaycode",
// 		data : data,
		dataType : "json",
// 		contentType:'application/json;charset=UTF-8',
		success : function(data) {
// 			if(data){
// 				$('#account').textbox('setValue',data.user.account);
// 				$('#version').textbox('setValue',data.user.version);
// 				$('#expired').textbox('setValue',data.user.expired);
				
// 				$('#space-total').textbox('setValue',data.user.space.total);
// 				$('#space-remain').textbox('setValue',data.user.space.remain);
// 				$('#space-used').textbox('setValue',data.user.space.used);
				
// 				$('#traffic-total').textbox('setValue',data.user.traffic.total);
// 				$('#traffic-remain').textbox('setValue',data.user.traffic.remain);
// 				$('#traffic-used').textbox('setValue',data.user.traffic.used);
// 			}
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

</body>
</html>