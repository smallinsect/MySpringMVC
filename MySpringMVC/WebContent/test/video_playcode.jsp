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
			if(data){
// 				var arr = data.playcode.split('src="');
// 				arr = arr[1].split('" type="');
// 				var http = arr[0];//获取视频播放链接
				player_init("cc_A5FEB0EA05F2100B9C33DC5901307461", data.playcode);
// 				console.log(parseDom(data.playcode)[0]);
			}
		},
		error : function(data) {
			console.log(data);
		}
	});
});

//参数playerID，即播放器父级元素的ID, res是请求接口成功后返回的对象
function player_init(playerID, res) {
	$("#"+playerID).append(res);
}

// //CC视频 默认会调用这个回调方法
// function on_cc_player_init(vid, objectID) {
//     var config = {};
//     config.on_player_stop = "onPlayerStop";
//     config.on_player_ready = "onPlayerReady";
//     config.on_player_pause = "onPlayerPause";
//     config.on_player_start = "onPlayerStart";
//     config.on_player_resume = "onPlayerResume";
//     config.on_player_seek = "onPlayerSeek";
 
//     // 跑马灯 start
//     config.player_plugins = {
//         Marquee : {
//             data: [
//                 {
//                     name: '11',
//                     type:"text",
//                     text:"helloworld",
//                     font:"微软雅黑", 
//                     size:20,
//                     color:"0xFF0000",
//                     loopTime:30000, 
//                     actions:[
//                         {
//                             index:0,
//                             duration:30000, 
//                             start:{
//                                 xpos:0.112,  
//                                 ypos:0.123,
//                                 alpha:1
//                             },
//                             end:{
//                                 xpos:0.812,  
//                                 ypos:0.823,
//                                 alpha:1
//                             }   
//                         }
//                     ]
//                 }
//             ]
//         } 
//     };
//     // 跑马灯 end
 
//     objectID = $("object").attr("id");
//     player = getSWF(objectID);
//     player.setConfig(config);
// }
 
// // 播放结束后回调
// function onPlayerStop() {
//     // 这里可以写一些视频播放结束要处理的逻辑
// }
// // 播放器准备就绪回调
// function onPlayerReady() {
//     // 回调【直接开始播放】
//     // player.start();
// }
// // 暂停播放时回调
// function onPlayerPause() {
//     // TODO
// }
// // 开始播放时回调
// function onPlayerStart() {
//     // TODO
// }
// // 暂停后继续播放时回调
// function onPlayerResume() {
//     // TODO
// }
// // 拖动播放时回调
// function onPlayerSeek() {
//     // 回调函数的参数：from,to 
//     // from, 定位之前的时间点（单位 秒）；to, 定位指定的时间点（单位 秒）
// }
 
// function getSWF(swfID) {
//     if (window.document[swfID]) {
//         return window.document[swfID];
//     } else if (navigator.appName.indexOf("Microsoft") == -1) {
//         if (document.embeds && document.embeds[swfID]) {
//             return document.embeds[swfID];
//         }
//     } else {
//         return document.getElementById(swfID);
//     }
// }


// var player1 = getSWF( "cc_A5FEB0EA05F2100B9C33DC5901307461" );
// function on_cc_player_init( vid, objectID ){
// 	var player = getSWF( objectID );
// 	console.info( player1 == player );
// 	player.start();
// }

// function getSWF(swfID) {
// 	if (window.document[swfID]) {
// 		return window.document[swfID];
// 	} else if (navigator.appName.indexOf("Microsoft") == -1) {
// 		if (document.embeds && document.embeds[swfID]) {
// 			return document.embeds[swfID];
// 		}
// 	} else {
// 		return document.getElementById(swfID);
// 	}
// }
</script>
</head>
<body>

<div id="cc_A5FEB0EA05F2100B9C33DC5901307461" style="width: 400px; height: 300px; border: 1px red solid;">
</div>

</body>
</html>