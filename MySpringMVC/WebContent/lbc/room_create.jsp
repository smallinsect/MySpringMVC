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
<style type="text/css">
ul{ list-style-type: none; }
ul li{ float: left; }
.ltitle{ width: 200px; display: block;}
.ltext{}
</style>

</head>
<body>
	<div id="tt" class="easyui-tabs" style="width:1000px;height:800px;">
		<div title="基本信息" style="padding:20px;display:none;">
			<ul>
				<li class="ltitle">直播间名称：</li>
				<li ><input class="easyui-validatebox" type="text" name="name" id="name" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">直播间模板：</li>
				<li ><input class="easyui-validatebox" type="text" name="templatetype" id="templatetype" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">直播开始时间：</li>
				<li ><input class="easyui-validatebox" type="text" name="livestarttime" id="livestarttime" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">第三方推流：</li>
				<li ><input class="easyui-validatebox" type="text" name="foreignpublish" id="foreignpublish" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">弹幕功能：</li>
				<li ><input class="easyui-validatebox" type="text" name="barrage" id="barrage" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">主持人模式：</li>
				<li ><input class="easyui-validatebox" type="text" name="openhostmode" id="openhostmode" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">主持人登录模式：</li>
				<li >111<input class="easyui-validatebox" type="text" name="hostloginmode" id="hostloginmode" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">显示在线人数：</li>
				<li >111<input class="easyui-validatebox" type="text" name="showusercount" id="showusercount" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">暖场视频：</li>
				<li ><input class="easyui-validatebox" type="text" name="warmvideoid" id="warmvideoid" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">讲师登录密码：</li>
				<li ><input class="easyui-validatebox" type="text" name="publisherpass" id="publisherpass" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">助教登录密码：</li>
				<li ><input class="easyui-validatebox" type="text" name="assistantpass" id="assistantpass" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">观众密码设置：</li>
				<li >
					<input class="easyui-validatebox" type="text" name="authtype" id="authtype" data-options="required:true" />
					播放端密码：<input class="easyui-validatebox" type="text" name="playpass" id="playpass" data-options="required:true" />
					验证地址：<input class="easyui-validatebox" type="text" name="checkurl" id="checkurl" data-options="required:true" />
				</li>
			</ul><br>
			<ul>
				<li class="ltitle">直播间描述：</li>
				<li ><input class="easyui-validatebox" type="text" name="desc" id="desc" data-options="required:true" /></li>
			</ul><br>
	    </div>   
	    <div title="高级选项" data-options="" style="overflow:auto;padding:20px;display:none;"> 
			<ul>
				<li class="ltitle">低延迟模式：</li>
				<li ><input class="easyui-validatebox" type="text" name="openlowdelaymode" id="openlowdelaymode" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">并发人数上限：</li>
				<li ><input class="easyui-validatebox" type="text" name="maxaudiencenum" id="maxaudiencenum" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">重复登录设置：</li>
				<li><input class="easyui-validatebox" type="text" name="repeatedloginsetting" id="repeatedloginsetting" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">聊天审核：</li>
				<li ><input class="easyui-validatebox" type="text" name="openChatManage" id="openChatManage" data-options="required:true" /></li>
			</ul><br>
			<h6>观看端设置</h6>
			<ul>
				<li class="ltitle">播放器背景图：</li>
				<li ><input class="easyui-validatebox" type="text" name="playerBackgroundImageUri" id="playerBackgroundImageUri" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">播放器提示语：</li>
				<li ><input class="easyui-validatebox" type="text" name="playerbackgroundhint" id="playerbackgroundhint" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">登录页banner：</li>
				<li ><input class="easyui-validatebox" type="text" name="loginPageBannerImageUri" id="loginPageBannerImageUri" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">观看页banner：</li>
				<li ><input class="easyui-validatebox" type="text" name="viewPageBannerImageUri" id="viewPageBannerImageUri" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">文档显示模式：</li>
				<li><input class="easyui-validatebox" type="text" name="documentdisplaymode" id="documentdisplaymode" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">直播倒计时：</li>
				<li><input class="easyui-validatebox" type="text" name="openlivecountdown" id="openlivecountdown" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">跑马灯功能：</li>
				<li><input class="easyui-validatebox" type="text" name="openmarquee" id="openmarquee" data-options="required:true" /></li>
			</ul><br>
			<h6>讲师端设置</h6>
			<ul>
				<li class="ltitle">网页登录验证：</li>
				<li ><input class="easyui-validatebox" type="text" name="dvr" id="dvr" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">手动录制模式：</li>
				<li ><input class="easyui-validatebox" type="text" name="manuallyrecordmode" id="manuallyrecordmode" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">讲师文档权限：</li>
				<li ><input class="easyui-validatebox" type="text" name="clientdocpermissions" id="clientdocpermissions" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">显示在线人数：</li>
				<li ><input class="easyui-validatebox" type="text" name="showlectueronlinenum" id="showlectueronlinenum" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">直播提醒设置：</li>
				<li><input class="easyui-validatebox" type="text" name="alarms" id="alarms" data-options="required:true" /></li>
			</ul><br>
			<h6>助教端设置</h6>
			<ul>
				<li class="ltitle">显示在线人数：</li>
				<li ><input class="easyui-validatebox" type="text" name="showassistonlinenum" id="showassistonlinenum" data-options="required:true" /></li>
			</ul><br>
	    </div>   
	    <div title="移动端广告" data-options="" style="padding:20px;display:none;">   
			<ul>
				<li class="ltitle">移动端广告：</li>
				<li ><input class="easyui-validatebox" type="text" name="mobileAdvertisements" id="mobileAdvertisements" data-options="required:true" /></li>
			</ul><br>
	    </div>
	    <div title="分享设置" data-options="" style="padding:20px;display:none;">   
			<h6>微信分享设置</h6>
			<ul>
				<li class="ltitle">图标：</li>
				<li ><input class="easyui-validatebox" type="text" name="sharePicture" id="sharePicture" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">标题：</li>
				<li ><input class="easyui-validatebox" type="text" name="shareTitle" id="shareTitle" data-options="required:true" /></li>
			</ul><br>
			<ul>
				<li class="ltitle">描述：</li>
				<li ><input class="easyui-validatebox" type="text" name="shareDescribe" id="shareDescribe" data-options="required:true" /></li>
			</ul><br>
	    </div>
	</div>

</body>
</html>