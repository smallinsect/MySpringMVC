package com.mvc.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mvc.bo.ImageAlternateBO;
import com.mvc.bo.VideoBO;
import com.mvc.constants.UserUrlCon;
import com.mvc.constants.VideoUrlCon;
import com.mvc.easyui.DataGrid;
import com.mvc.utils.URLConUtil;

@Controller
public class VideoAction {
	
	@RequestMapping("getVideoList")
	@ResponseBody
	public List<VideoBO> getVideoList(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		//params.put("videoid_from", null);//起始 videoid，若为空，则从上传的第⼀一个视频开始
		//params.put("videoid_to", null);//终⽌止 videoid，若为空，则到最后⼀一个上传的视频
		params.put("num_per_page", "100");//返回信息时，每⻚页包含的视频个数 注:允许范围为 1~100
		params.put("page", "1");//当前⻚页码
		params.put("format", "json");
		String json = URLConUtil.retrieve(VideoUrlCon.VIDEOS_V4, params);
		JSONObject object = JSONObject.parseObject(json);
		JSONObject videos = object.getJSONObject("videos");
		Integer itotal = videos.getInteger("total");
//		List<VideoBO> listVideo = JSONObject.parseArray(videos.getString("video"), VideoBO.class);
		JSONArray array = JSONObject.parseArray(videos.getString("video"));
		List<VideoBO> listVideo = new ArrayList<VideoBO>();
		for(int i = 0; i < array.size(); ++i) {
			JSONObject jo = array.getJSONObject(i);
			VideoBO vb = JSONObject.parseObject(jo.toString(), VideoBO.class);
			List<ImageAlternateBO> listImage = JSONObject.parseArray(jo.getString("image-alternate"), ImageAlternateBO.class);
			vb.setImagealternate(listImage);
			listVideo.add(vb);
		}
		
		return listVideo;
	}
	
	@RequestMapping("getVideoDataGrid")
	@ResponseBody
	public DataGrid<VideoBO> getVideoDataGrid(HttpServletRequest request, HttpServletResponse response) {
		//每页行数
		String rows = request.getParameter("rows");
		//页码
		String page = request.getParameter("page");
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		//params.put("videoid_from", null);//起始 videoid，若为空，则从上传的第⼀一个视频开始
		//params.put("videoid_to", null);//终⽌止 videoid，若为空，则到最后⼀一个上传的视频
		if(rows != null) {
			params.put("num_per_page", rows);//返回信息时，每⻚页包含的视频个数 注:允许范围为 1~100
		}else {
			params.put("num_per_page", "100");
		}
		if(page != null) {
			params.put("page", page);//当前的页码
		}else {
			params.put("page", "1");
		}
		params.put("format", "json");
		String json = URLConUtil.retrieve(VideoUrlCon.VIDEOS_V4, params);
		
		JSONObject object = JSONObject.parseObject(json);
		JSONObject videos = object.getJSONObject("videos");
		Integer itotal = videos.getInteger("total");
		JSONArray array = JSONObject.parseArray(videos.getString("video"));
		
		List<VideoBO> listVideo = new ArrayList<VideoBO>();
		for(int i = 0; i < array.size(); ++i) {
			JSONObject jo = array.getJSONObject(i);
			VideoBO vb = JSONObject.parseObject(jo.toString(), VideoBO.class);
			List<ImageAlternateBO> listImage = JSONObject.parseArray(jo.getString("image-alternate"), ImageAlternateBO.class);
			vb.setImagealternate(listImage);
			listVideo.add(vb);
		}
		
		return new DataGrid<VideoBO>(itotal, listVideo);
	}
	
	/**
	 * 获取单个视频信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("getVideo")
	@ResponseBody
	public VideoBO getVideo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		params.put("videoid", "F7F8944884AC773D9C33DC5901307461");
		params.put("format", "json");
		String json = URLConUtil.retrieve(VideoUrlCon.VIDEO_V4, params);
		JSONObject object = JSONObject.parseObject(json);
		VideoBO video = JSONObject.parseObject(object.getString("video"), VideoBO.class);
		List<ImageAlternateBO> list = JSONObject.parseArray(object.getJSONObject("video").getString("image-alternate"), ImageAlternateBO.class);
		video.setImagealternate(list);
		return video;
	}
	
}
