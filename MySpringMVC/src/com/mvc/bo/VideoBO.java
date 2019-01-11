package com.mvc.bo;

import java.util.List;

public class VideoBO {
	private String id;//视频id
	private String title;//视频标题
	private String desp;//视屏描述
	private String tags;//视频标签
	private Double duration;//视频时长，单位秒
	private String category;//视频分类ID
	private String image;//视频截图地址
	private Double imageindex;//视频截图序号
	private List<ImageAlternateBO> imagealternate;//视频截图排列信息
	private List<DefinitionBO> definition;//视频文件大小信息
	private Double totalsize;//视频占用总空间，包含原始文件大小
	private Double originalsize;//原始文件占用空间
	private String uploaduser;//上传（主账号/子账号的邮箱）
	private String uploadtime;//上传时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getImageindex() {
		return imageindex;
	}
	public void setImageindex(Double imageindex) {
		this.imageindex = imageindex;
	}
	public List<ImageAlternateBO> getImagealternate() {
		return imagealternate;
	}
	public void setImagealternate(List<ImageAlternateBO> imagealternate) {
		this.imagealternate = imagealternate;
	}
	public List<DefinitionBO> getDefinition() {
		return definition;
	}
	public void setDefinition(List<DefinitionBO> definition) {
		this.definition = definition;
	}
	public Double getTotalsize() {
		return totalsize;
	}
	public void setTotalsize(Double totalsize) {
		this.totalsize = totalsize;
	}
	public Double getOriginalsize() {
		return originalsize;
	}
	public void setOriginalsize(Double originalsize) {
		this.originalsize = originalsize;
	}
	public String getUploaduser() {
		return uploaduser;
	}
	public void setUploaduser(String uploaduser) {
		this.uploaduser = uploaduser;
	}
	public String getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(String uploadtime) {
		this.uploadtime = uploadtime;
	}
	
}
