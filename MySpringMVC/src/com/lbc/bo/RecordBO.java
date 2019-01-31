package com.lbc.bo;

public class RecordBO {
	private String id;//回放id
	private String liveId;//直播id
	private String startTime;//开始时间
	private String stopTime;//结束时间
	private Integer recordStatus;//录制状态，0表示录制未结束，1表示录制完成
	private Integer recordVideoStatus;//
	private String recordVideoId;//录制视频id，如果recordStatus为0则返回-1
	private String replayUrl;//回放地址，当recordStatus为0时返回""
	private String offlinePackageUrl;//离线包下载地址，注：只有开通离线播放权限才会返回该参数
	private String offlinePackageMd5;//离线包md5，注：只有开通离线播放权限才会返回该参数
	private Integer templateType;//模板类型
	private Integer sourceType;//回放来源，0：录制； 1：合并； 2：迁移； 3：上传
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStopTime() {
		return stopTime;
	}
	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}
	public Integer getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(Integer recordStatus) {
		this.recordStatus = recordStatus;
	}
	public Integer getRecordVideoStatus() {
		return recordVideoStatus;
	}
	public void setRecordVideoStatus(Integer recordVideoStatus) {
		this.recordVideoStatus = recordVideoStatus;
	}
	public String getRecordVideoId() {
		return recordVideoId;
	}
	public void setRecordVideoId(String recordVideoId) {
		this.recordVideoId = recordVideoId;
	}
	public String getReplayUrl() {
		return replayUrl;
	}
	public void setReplayUrl(String replayUrl) {
		this.replayUrl = replayUrl;
	}
	public String getOfflinePackageUrl() {
		return offlinePackageUrl;
	}
	public void setOfflinePackageUrl(String offlinePackageUrl) {
		this.offlinePackageUrl = offlinePackageUrl;
	}
	public String getOfflinePackageMd5() {
		return offlinePackageMd5;
	}
	public void setOfflinePackageMd5(String offlinePackageMd5) {
		this.offlinePackageMd5 = offlinePackageMd5;
	}
	public Integer getTemplateType() {
		return templateType;
	}
	public void setTemplateType(Integer templateType) {
		this.templateType = templateType;
	}
	public Integer getSourceType() {
		return sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	
}
