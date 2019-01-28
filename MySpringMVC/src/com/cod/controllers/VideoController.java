package com.cod.controllers;

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
import com.cod.bo.ImageAlternateBO;
import com.cod.bo.VideoBO;
import com.cod.constants.VideoUrlCon;
import com.common.constants.UserUrlCon;
import com.common.easyui.DataGrid;
import com.common.utils.URLConUtil;

@Controller
public class VideoController {
	
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
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS_V4, params);
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
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS_V4, params);
		
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
	 * 	获取单个视频信息
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
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_V4, params);
		JSONObject object = JSONObject.parseObject(json);
		VideoBO video = JSONObject.parseObject(object.getString("video"), VideoBO.class);
		List<ImageAlternateBO> list = JSONObject.parseArray(object.getJSONObject("video").getString("image-alternate"), ImageAlternateBO.class);
		video.setImagealternate(list);
		return video;
	}
	
	/**
	 * 	获取单个视频信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("getVideoPlaycode")
	@ResponseBody
	public String getVideoPlaycode(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		params.put("videoid", "1C6ADBF99B9BE3DD9C33DC5901307461");
		//params.put("playerid", "");//播放器id，若为空，返回默认播放器
		params.put("player_width", "100%");
		params.put("player_height", "100%");
		params.put("auto_play", "true");
		params.put("mediatype", "1");
		params.put("format", "json");
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_PLAYCODE, params);
		JSONObject object = JSONObject.parseObject(json);
		String playcode = object.getString("video");
		return playcode;
	}
	
	/**
	 * 	获取指定用户的有效视频信息，V1版本
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("video")
	@ResponseBody
	public String video(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO, params);
		return json;
	}
	
	/**
	 * 	获取指定用户的有效视频信息，V2版本
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoV2")
	@ResponseBody
	public String videoV2(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_V2, params);
		return json;
	}
	
	/**
	 * 	获取指定用户的有效视频信息，V3版本
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoV3")
	@ResponseBody
	public String videoV3(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_V3, params);
		return json;
	}	
	
	/**
	 * 	获取指定用户的有效视频信息，V4版本
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoV4")
	@ResponseBody
	public String videoV4(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_V4, params);
		return json;
	}
	
	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V1
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videos")
	@ResponseBody
	public String videos(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS, params);
		return json;
	}	
	
	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V2
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videosV2")
	@ResponseBody
	public String videosV2(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS_V2, params);
		return json;
	}	
	
	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V3
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videosV3")
	@ResponseBody
	public String videosV3(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS_V3, params);
		return json;
	}	
	
	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V4
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videosV4")
	@ResponseBody
	public String videosV4(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS_V4, params);
		return json;
	}	
	
	/**
	 * 	按分类获取视频信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videosCategory")
	@ResponseBody
	public String videosCategory(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS_CATEGORY, params);
		return json;
	}		
	
	/**
	 * 	获取视频播放代码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoPlaycode")
	@ResponseBody
	public String videoPlaycode(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_PLAYCODE, params);
		return json;
	}	
	
	/**
	 * 	编辑视频信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoUpdate")
	@ResponseBody
	public String videoUpdate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_UPDATE, params);
		return json;
	}	
	
	/**
	 * 	删除视频
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoDelete")
	@ResponseBody
	public String videoDelete(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_DELETE, params);
		return json;
	}
	
	/**
	 * 	获取视频分类，V2版本
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoCategoryV2")
	@ResponseBody
	public String videoCategoryV2(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_CATEGORY_V2, params);
		return json;
	}
	
	/**
	 * 	获取视频分类，V1版本
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoCategory")
	@ResponseBody
	public String videoCategory(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_CATEGORY, params);
		return json;
	}
	
	/**
	 * 	创建视频分类
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("categoryCreate")
	@ResponseBody
	public String categoryCreate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.CATEGORY_CREATE, params);
		return json;
	}
	
	/**
	 * 	编辑视频分类
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("categoryUpdate")
	@ResponseBody
	public String categoryUpdate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.CATEGORY_UPDATE, params);
		return json;
	}	
	
	/**
	 * 	删除视频分类
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("categoryDelete")
	@ResponseBody
	public String categoryDelete(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.CATEGORY_DELETE, params);
		return json;
	}
	
	/**
	 * 	同步视频里列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlists")
	@ResponseBody
	public String playlists(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLISTS, params);
		return json;
	}
	
	/**
	 * 	创建视频里列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlistCreate")
	@ResponseBody
	public String playlistCreate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLISTS_CREATE, params);
		return json;
	}

	/**
	 * 	编辑视频里列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlistUpdate")
	@ResponseBody
	public String playlistUpdate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLISTS_UPDATE, params);
		return json;
	}
	
	/**
	 * 	删除视频里列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlistDelete")
	@ResponseBody
	public String playlistDelete(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLISTS_DELETE, params);
		return json;
	}	

	/**
	 * 	搜索视频
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videosSearch")
	@ResponseBody
	public String videosSearch(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOS_SEARCH, params);
		return json;
	}	

	/**
	 * 	播放量统计，获取用户维度下按小时统计的播放量，该接口仅提供某一天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountUserHourly")
	@ResponseBody
	public String statsPlaycountUserHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_USER_HOURLY, params);
		return json;
	}
	
	/**
	 * 	播放量统计，获取用户维度下按天统计的播放量，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountUserDaily")
	@ResponseBody
	public String statsPlaycountUserDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_USER_DAILY, params);
		return json;
	}
	
	/**
	 * 	播放量统计，获取视频维度下按小时统计的播放量，该接口仅提供某一天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountVideoHourly")
	@ResponseBody
	public String statsPlaycountVideoHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_VIDEO_HOURLY, params);
		return json;
	}
	
	/**
	 * 	播放量统计，获取视频维度下按天统计的播放量，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountVideoDaily")
	@ResponseBody
	public String statsPlaycountVideoDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_VIDEO_DAILY, params);
		return json;
	}
	
	/**
	 * 	播放量统计，获取视频维度下按天统计的播放量，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationUserHourly")
	@ResponseBody
	public String statsPlaydurationUserHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_USER_HOURLY, params);
		return json;
	}
	
	/**
	 * 	播放量统计，获取用户维度下按天统计的播放时长，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationUserDaily")
	@ResponseBody
	public String statsPlaydurationUserDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_USER_DAILY, params);
		return json;
	}
	
	/**
	 * 	播放量统计，获取视频维度下按小时统计的播放时长，该接口仅提供某一天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationVideoHourly")
	@ResponseBody
	public String statsPlaydurationVideoHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_VIDEO_HOURLY, params);
		return json;
	}
	
	/**
	 * 	播放量统计，获取视频维度下按天统计的播放时长，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationVideoDaily")
	@ResponseBody
	public String statsPlaydurationVideoDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_VIDEO_DAILY, params);
		return json;
	}
	
	/**
	 * 	观众量统计，获取用户维度下按小时统计的观众量，该接口仅提供某一天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsUniquevisitorUserHourly")
	@ResponseBody
	public String statsUniquevisitorUserHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_UNIQUEVISITOR_USER_HOURLY, params);
		return json;
	}	
	
	/**
	 * 	观众量统计，获取用户维度下按天统计的观众量，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsUniquevisitorUserDaily")
	@ResponseBody
	public String statsUniquevisitorUserDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_UNIQUEVISITOR_USER_DAILY, params);
		return json;
	}

	/**
	 * 	新增观众量统计，获取用户维度下按小时统计的新增观众量，该接口仅提供某一天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsNewuniquevisitorUserHourly")
	@ResponseBody
	public String statsNewuniquevisitorUserHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_NEWUNIQUEVISITOR_USER_HOURLY, params);
		return json;
	}
	
	/**
	 * 	新增观众量统计，获取用户维度下按天统计的新增观众量，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsNewuniquevisitorUserDaily")
	@ResponseBody
	public String statsNewuniquevisitorUserDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_NEWUNIQUEVISITOR_USER_DAILY, params);
		return json;
	}
	
	/**
	 * 	新增观众量统计，获取用户维度下按天统计的播放比例，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsAttentionUserDaily")
	@ResponseBody
	public String statsAttentionUserDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_ATTENTION_USER_DAILY, params);
		return json;
	}	
	
	/**
	 * 	新增观众量统计，获取视频维度下按天统计的播放比例，该接口提供多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsAttentionVideoDaily")
	@ResponseBody
	public String statsAttentionVideoDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_ATTENTION_VIDEO_DAILY, params);
		return json;
	}
	
	/**
	 * 	播放量排行统计，获取播放量排行，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountSorted")
	@ResponseBody
	public String statsPlaycountSorted(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_SORTED, params);
		return json;
	}
	
	/**
	 * 	域名播放量统计，获取用户维度下按天统计的域名播放量，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountUserDailyDomain")
	@ResponseBody
	public String statsPlaycountUserDailyDomain(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_USER_DAILY_DOMAIN, params);
		return json;
	}
	
	/**
	 * 	域名播放量统计，获取视频维度下按天统计的域名播放量，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountVideoDailyDomain")
	@ResponseBody
	public String statsPlaycountVideoDailyDomain(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_VIDEO_DAILY_DOMAIN, params);
		return json;
	}
	
	/**
	 * 	域名播放时长统计，获取用户维度下按天统计的域名播放时长，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationUserDailyDomain")
	@ResponseBody
	public String statsPlaydurationUserDailyDomain(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_USER_DAILY_DOMAIN, params);
		return json;
	}
	
	/**
	 * 	域名播放时长统计，获取视频维度下按天统计的域名播放时长，该接口提供一天或多天的数据查
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationVideoDailyDomain")
	@ResponseBody
	public String statsPlaydurationVideoDailyDomain(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_VIDEO_DAILY_DOMAIN, params);
		return json;
	}
	
	/**
	 * 	设备类型播放量统计，获取用户维度下按天统计的设备类型播放量，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountUserDailyDevice")
	@ResponseBody
	public String statsPlaycountUserDailyDevice(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_USER_DAILY_DEVICE, params);
		return json;
	}
	
	/**
	 * 	操作系统播放量统计，获取⽤用户维度下按天统计的操作系统播放量，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountUserDailyOperatingsystem")
	@ResponseBody
	public String statsPlaycountUserDailyOperatingsystem(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_USER_DAILY_OPERATINGSYSTEM, params);
		return json;
	}
	
	/**
	 * 	操作系统播放量统计，获取用户维度下按天统计的操作系统播放量，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountUserDailyBrowser")
	@ResponseBody
	public String statsPlaycountUserDailyBrowser(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_USER_DAILY_BROWSER, params);
		return json;
	}	
		
	/**
	 * 	地理位置播放量统计，获取用户维度下按天统计的地理位置播放量，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountUserDailyLocation")
	@ResponseBody
	public String statsPlaycountUserDailyLocation(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_USER_DAILY_LOCATION, params);
		return json;
	}
	
	/**
	 * 	地理位置播放量统计，获取视频维度下按天统计的地理位置播放量，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaycountVideoDailyLocation")
	@ResponseBody
	public String statsPlaycountVideoDailyLocation(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYCOUNT_VIDEO_DAILY_LOCATION, params);
		return json;
	}
	
	/**
	 * 	地理位置播放时长统计，获取用户维度下按天统计的地理位置播放时长，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationUserDailyLocation")
	@ResponseBody
	public String statsPlaydurationUserDailyLocation(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_USER_DAILY_LOCATION, params);
		return json;
	}
	
	/**
	 * 	地理位置播放时长统计，获取视频维度下按天统计的地理位置播放时长，该接口提供一天或多天的数据查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statsPlaydurationVideoDailyLocation")
	@ResponseBody
	public String statsPlaydurationVideoDailyLocation(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.STATS_PLAYDURATION_VIDEO_DAILY_LOCATION, params);
		return json;
	}
	
	/**
	 * 	用户流量统计，通过该接口可以获取某用户某天的小时维度的流量信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("trafficUserHourly")
	@ResponseBody
	public String trafficUserHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.TRAFFIC_USER_HOURLY, params);
		return json;
	}
	
	/**
	 * 	用户流量统计，通过该接口可以获取某用户某天的小时维度的流量信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("trafficUserDaily")
	@ResponseBody
	public String trafficUserDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.TRAFFIC_USER_DAILY, params);
		return json;
	}
	
	/**
	 * 	用户流量统计，通过该接口可以获取某用户一段时间内月维度的流量信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("trafficUserMonthly")
	@ResponseBody
	public String trafficUserMonthly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.TRAFFIC_USER_MONTHLY, params);
		return json;
	}
	
	/**
	 * 	视频流量统计，通过该接口可以获取某视频某天的小时维度的流量信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("trafficVideoHourly")
	@ResponseBody
	public String trafficVideoHourly(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.TRAFFIC_USER_MONTHLY, params);
		return json;
	}
	
	/**
	 * 	视频流量统计，通过该接口可以获取某视频一段时间内天维度的流量信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("trafficVideoDaily")
	@ResponseBody
	public String trafficVideoDaily(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.TRAFFIC_VIDEO_DAILY, params);
		return json;
	}
	
	/**
	 * 	获取视频字幕下载地址，通过该接口可以获取视频字幕下载地址，音频转写后可用
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("subtitleVideo")
	@ResponseBody
	public String subtitleVideo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.SUBTITLE_VIDEO, params);
		return json;
	}
	
	/**
	 * 	搜索视频字幕信息，通过该接口可以根据关键词搜索单个视频的字幕信息，音频转写后可用
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("subtitleSearchVideo")
	@ResponseBody
	public String subtitleSearchVideo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.SUBTITLE_SEARCH_VIDEO, params);
		return json;
	}
	
	/**
	 * 	搜索用户字幕信息，通过该接口可以根据关键词搜索用户所有视频的字幕信息，音频转写后可用
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("subtitleSearchUser")
	@ResponseBody
	public String subtitleSearchUser(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.SUBTITLE_SEARCH_USER, params);
		return json;
	}
	
	/**
	 * 	获取用户自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某用户下所有视频播放记录日志（需要用户实现自定义参数播放统计功能）
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlogCustomUserV2")
	@ResponseBody
	public String playlogCustomUserV2(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLOG_CUSTOM_USER_V2, params);
		return json;
	}
	
	/**
	 * 	获取用户自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某用户下所有视频播放记录日志（需要用户实现自定义参数播放统计功能）
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlogCustomUser")
	@ResponseBody
	public String playlogCustomUser(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLOG_CUSTOM_USER, params);
		return json;
	}
	
	/**
	 * 	获取视频自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现⾃自定义参数播放统计功
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlogCustomVideoV2")
	@ResponseBody
	public String playlogCustomVideoV2(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLOG_CUSTOM_VIDEO_V2, params);
		return json;
	}
	
	/**
	 * 	获取视频自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现⾃自定义参数播放统计功
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlogCustomVideo")
	@ResponseBody
	public String playlogCustomVideo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLOG_CUSTOM_VIDEO, params);
		return json;
	}
	
	/**
	 * 	获取视频播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现自定义参数播放统计功
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlogVideoV2")
	@ResponseBody
	public String playlogVideoV2(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLOG_VIDEO_V2, params);
		return json;
	}
	
	/**
	 * 	获取视频播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现自定义参数播放统计功
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlogVideo")
	@ResponseBody
	public String playlogVideo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLOG_VIDEO, params);
		return json;
	}
	
	/**
	 * 	获取用户播放记录日志，通过该接口可以查询用户所有播放记录日志（需要用户实现自定义参数播放统计功能）
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("playlogUserV2")
	@ResponseBody
	public String playlogUserV2(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PLAYLOG_USER_V2, params);
		return json;
	}
	
	/**
	 * 	获取用户播放记录日志，通过该接口可以查询用户所有播放记录日志（需要用户实现自定义参数播放统计功能）
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videoOriginal")
	@ResponseBody
	public String videoOriginal(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEO_ORIGINAL, params);
		return json;
	}
	
	/**
	 * 	带宽详情信息统计，通过该接口可以获取指定时间内用户带宽详细信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("bandwidthUserDetail")
	@ResponseBody
	public String bandwidthUserDetail(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.BANDWIDTH_USER_DETAIL, params);
		return json;
	}
	
	/**
	 * 	获取视频打点信息，通过该接口可以获取单个视频打点信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("markVideo")
	@ResponseBody
	public String markVideo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.MARK_VIDEO, params);
		return json;
	}
	
	/**
	 * 	获取视频打点信息，通过该接口可以获取单个视频打点信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("markVideos")
	@ResponseBody
	public String markVideos(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.MARK_VIDEOS, params);
		return json;
	}
	
	/**
	 * 	获取单个视频播放密码，通过该接口可以获取单个视频播放密码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("pwdVideo")
	@ResponseBody
	public String pwdVideo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PWD_VIDEO, params);
		return json;
	}
	
	/**
	 * 	批量获取视频的播放密码，通过该接口可以批量获取多个视频播放密码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("pwdVideos")
	@ResponseBody
	public String pwdVideos(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.PWD_VIDEOS, params);
		return json;
	}
	
	/**
	 * 	设置视频播放地址有效时长，通过该接口可以设置用户视频播放地址的有效时间 (需开通视频播放地址有效时长的设置权限)
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("authtimeoutUpdate")
	@ResponseBody
	public String authtimeoutUpdate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.AUTHTIMEOUT_UPDATE, params);
		return json;
	}
	
	/**
	 * 	设置单个视频播放密码，通过该接口可以修改一个视频的播放密码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videopwdUpdate")
	@ResponseBody
	public String videopwdUpdate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOPWD_UPDATE, params);
		return json;
	}
	
	/**
	 * 	设置一批视频播放密码，通过该接口可以修改一批视频的播放密码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("videopwdsUpdate")
	@ResponseBody
	public String videopwdsUpdate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.cretrieve(VideoUrlCon.VIDEOPWDS_UPDATE, params);
		return json;
	}
	
}
