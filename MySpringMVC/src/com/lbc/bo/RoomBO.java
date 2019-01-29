package com.lbc.bo;

import java.util.List;

//直播间信息
public class RoomBO {
	//基本信息
	private String id;
	private String name;//直播间名称
	private Integer templateType;//直播间模板
	private String liveStartTime;//直播开始时间 "2019-01-29 21:00:39"
	private Integer foreignPublish;//第三方推流
	private List<String> publishUrls;//第三方推流地址
	private Integer barrage;//弹幕功能
	private String openHostMode;//主持人模式
	private String hostLoginMode;//主持人登录模式
	private String showUserCount;//显示在线人数
	private String warmVideoId;//暖场视频
	private String publisherPass;//讲师登录密码
	private String assistantPass;//助教登录密码

	private Integer authType;//观众密码设置
	private String playPass;//播放端密码
	private String checkUrl;//验证地址
	
	private String desc;//直播间描述
	
	//高级选项
	private String openLowDelayMode;//低延迟模式
	private String maxAudienceNum;//并发人数上限
	private String repeatedLoginSetting;//重复登录设置
	private String openChatManage;//聊天审核
	private String playerBackgroundImageUri;//播放器背景图
	private String playerBackgroundHint;//播放提示语
	private String loginPageBannerImageUri;//登录页banner
	private String viewPageBannerImageUri;//观看页banner
	private String documentDisplayMode;//文档显示模式
	private String openLiveCountdown;//直播倒计时
	private String openMarquee;//跑马灯功能

	private String dvr;//讲师端设置 网页登录验证
	private String manuallyRecordMode;//讲师端设置 手动录制模式
	private String clientDocPermissions;//讲师端设置 讲师文档权限
	private String showLectuerOnlineNum;//讲师端设置 显示在线人数
	private String alarms;//讲师端设置 直播提醒设置
	
	private String showAssistOnlineNum;//助教端设置 显示在线人数
	
	//移动端广告
	private String showMobileAdvertisement;//
	private String mobileAdvertisements;//移动端广告
	
	//分享设置
	private String sharePicture;//微信分享设置 图标
	private String shareTitle;//标题
	private String shareDescribe;//描述
	
	//未知变量属性
	private Integer status;//
	private String delayTime;
	private String multiQuality;
	private String whiteListId;
	private String webLoginVerify;
	private String cashsReward;
	private String propsReward;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTemplateType() {
		return templateType;
	}
	public void setTemplateType(Integer templateType) {
		this.templateType = templateType;
	}
	public String getLiveStartTime() {
		return liveStartTime;
	}
	public void setLiveStartTime(String liveStartTime) {
		this.liveStartTime = liveStartTime;
	}
	public Integer getForeignPublish() {
		return foreignPublish;
	}
	public void setForeignPublish(Integer foreignPublish) {
		this.foreignPublish = foreignPublish;
	}
	public List<String> getPublishUrls() {
		return publishUrls;
	}
	public void setPublishUrls(List<String> publishUrls) {
		this.publishUrls = publishUrls;
	}
	public Integer getBarrage() {
		return barrage;
	}
	public void setBarrage(Integer barrage) {
		this.barrage = barrage;
	}
	public String getOpenHostMode() {
		return openHostMode;
	}
	public void setOpenHostMode(String openHostMode) {
		this.openHostMode = openHostMode;
	}
	public String getHostLoginMode() {
		return hostLoginMode;
	}
	public void setHostLoginMode(String hostLoginMode) {
		this.hostLoginMode = hostLoginMode;
	}
	public String getShowUserCount() {
		return showUserCount;
	}
	public void setShowUserCount(String showUserCount) {
		this.showUserCount = showUserCount;
	}
	public String getWarmVideoId() {
		return warmVideoId;
	}
	public void setWarmVideoId(String warmVideoId) {
		this.warmVideoId = warmVideoId;
	}
	public String getPublisherPass() {
		return publisherPass;
	}
	public void setPublisherPass(String publisherPass) {
		this.publisherPass = publisherPass;
	}
	public String getAssistantPass() {
		return assistantPass;
	}
	public void setAssistantPass(String assistantPass) {
		this.assistantPass = assistantPass;
	}
	public Integer getAuthType() {
		return authType;
	}
	public void setAuthType(Integer authType) {
		this.authType = authType;
	}
	public String getPlayPass() {
		return playPass;
	}
	public void setPlayPass(String playPass) {
		this.playPass = playPass;
	}
	public String getCheckUrl() {
		return checkUrl;
	}
	public void setCheckUrl(String checkUrl) {
		this.checkUrl = checkUrl;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getOpenLowDelayMode() {
		return openLowDelayMode;
	}
	public void setOpenLowDelayMode(String openLowDelayMode) {
		this.openLowDelayMode = openLowDelayMode;
	}
	public String getMaxAudienceNum() {
		return maxAudienceNum;
	}
	public void setMaxAudienceNum(String maxAudienceNum) {
		this.maxAudienceNum = maxAudienceNum;
	}
	public String getRepeatedLoginSetting() {
		return repeatedLoginSetting;
	}
	public void setRepeatedLoginSetting(String repeatedLoginSetting) {
		this.repeatedLoginSetting = repeatedLoginSetting;
	}
	public String getOpenChatManage() {
		return openChatManage;
	}
	public void setOpenChatManage(String openChatManage) {
		this.openChatManage = openChatManage;
	}
	public String getPlayerBackgroundImageUri() {
		return playerBackgroundImageUri;
	}
	public void setPlayerBackgroundImageUri(String playerBackgroundImageUri) {
		this.playerBackgroundImageUri = playerBackgroundImageUri;
	}
	public String getPlayerBackgroundHint() {
		return playerBackgroundHint;
	}
	public void setPlayerBackgroundHint(String playerBackgroundHint) {
		this.playerBackgroundHint = playerBackgroundHint;
	}
	public String getLoginPageBannerImageUri() {
		return loginPageBannerImageUri;
	}
	public void setLoginPageBannerImageUri(String loginPageBannerImageUri) {
		this.loginPageBannerImageUri = loginPageBannerImageUri;
	}
	public String getViewPageBannerImageUri() {
		return viewPageBannerImageUri;
	}
	public void setViewPageBannerImageUri(String viewPageBannerImageUri) {
		this.viewPageBannerImageUri = viewPageBannerImageUri;
	}
	public String getDocumentDisplayMode() {
		return documentDisplayMode;
	}
	public void setDocumentDisplayMode(String documentDisplayMode) {
		this.documentDisplayMode = documentDisplayMode;
	}
	public String getOpenLiveCountdown() {
		return openLiveCountdown;
	}
	public void setOpenLiveCountdown(String openLiveCountdown) {
		this.openLiveCountdown = openLiveCountdown;
	}
	public String getOpenMarquee() {
		return openMarquee;
	}
	public void setOpenMarquee(String openMarquee) {
		this.openMarquee = openMarquee;
	}
	public String getDvr() {
		return dvr;
	}
	public void setDvr(String dvr) {
		this.dvr = dvr;
	}
	public String getManuallyRecordMode() {
		return manuallyRecordMode;
	}
	public void setManuallyRecordMode(String manuallyRecordMode) {
		this.manuallyRecordMode = manuallyRecordMode;
	}
	public String getClientDocPermissions() {
		return clientDocPermissions;
	}
	public void setClientDocPermissions(String clientDocPermissions) {
		this.clientDocPermissions = clientDocPermissions;
	}
	public String getShowLectuerOnlineNum() {
		return showLectuerOnlineNum;
	}
	public void setShowLectuerOnlineNum(String showLectuerOnlineNum) {
		this.showLectuerOnlineNum = showLectuerOnlineNum;
	}
	public String getAlarms() {
		return alarms;
	}
	public void setAlarms(String alarms) {
		this.alarms = alarms;
	}
	public String getShowAssistOnlineNum() {
		return showAssistOnlineNum;
	}
	public void setShowAssistOnlineNum(String showAssistOnlineNum) {
		this.showAssistOnlineNum = showAssistOnlineNum;
	}
	public String getShowMobileAdvertisement() {
		return showMobileAdvertisement;
	}
	public void setShowMobileAdvertisement(String showMobileAdvertisement) {
		this.showMobileAdvertisement = showMobileAdvertisement;
	}
	public String getMobileAdvertisements() {
		return mobileAdvertisements;
	}
	public void setMobileAdvertisements(String mobileAdvertisements) {
		this.mobileAdvertisements = mobileAdvertisements;
	}
	public String getSharePicture() {
		return sharePicture;
	}
	public void setSharePicture(String sharePicture) {
		this.sharePicture = sharePicture;
	}
	public String getShareTitle() {
		return shareTitle;
	}
	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}
	public String getShareDescribe() {
		return shareDescribe;
	}
	public void setShareDescribe(String shareDescribe) {
		this.shareDescribe = shareDescribe;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDelayTime() {
		return delayTime;
	}
	public void setDelayTime(String delayTime) {
		this.delayTime = delayTime;
	}
	public String getMultiQuality() {
		return multiQuality;
	}
	public void setMultiQuality(String multiQuality) {
		this.multiQuality = multiQuality;
	}
	public String getWhiteListId() {
		return whiteListId;
	}
	public void setWhiteListId(String whiteListId) {
		this.whiteListId = whiteListId;
	}
	public String getWebLoginVerify() {
		return webLoginVerify;
	}
	public void setWebLoginVerify(String webLoginVerify) {
		this.webLoginVerify = webLoginVerify;
	}
	public String getCashsReward() {
		return cashsReward;
	}
	public void setCashsReward(String cashsReward) {
		this.cashsReward = cashsReward;
	}
	public String getPropsReward() {
		return propsReward;
	}
	public void setPropsReward(String propsReward) {
		this.propsReward = propsReward;
	}
	
}
