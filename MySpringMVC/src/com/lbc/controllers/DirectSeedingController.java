package com.lbc.controllers;

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
import com.lbc.constants.DirectSeedingUrlCon;

@Controller
public class DirectSeedingController {
	
	@RequestMapping("getRoomInfoDataGrid")
	@ResponseBody
	public DataGrid<VideoBO> getRoomInfoDataGrid(HttpServletRequest request, HttpServletResponse response) {
		//每页行数
		String rows = request.getParameter("rows");
		//页码
		String page = request.getParameter("page");
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		if(rows != null) {
			params.put("pagenum", rows);//返回信息时，每页包含的视频个数 注:允许范围为 1~100
		}else {
			params.put("pagenum", "100");
		}
		if(page != null) {
			params.put("pageindex", page);//当前的页码
		}else {
			params.put("pageindex", "1");
		}
		params.put("format", "json");
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOM_INFO, params);
		
//		JSONObject object = JSONObject.parseObject(json);
//		JSONObject videos = object.getJSONObject("videos");
//		Integer itotal = videos.getInteger("total");
//		JSONArray array = JSONObject.parseArray(videos.getString("video"));
//		
//		List<VideoBO> listVideo = new ArrayList<VideoBO>();
//		for(int i = 0; i < array.size(); ++i) {
//			JSONObject jo = array.getJSONObject(i);
//			VideoBO vb = JSONObject.parseObject(jo.toString(), VideoBO.class);
//			List<ImageAlternateBO> listImage = JSONObject.parseArray(jo.getString("image-alternate"), ImageAlternateBO.class);
//			vb.setImagealternate(listImage);
//			listVideo.add(vb);
//		}
		
		return null;
	}
	
	/**
	 * 	创建直播间
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomCreate")
	@ResponseBody
	public String roomCreate(HttpServletRequest request, HttpServletResponse response) {
		//每页行数
		String rows = request.getParameter("rows");
		//页码
		String page = request.getParameter("page");
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		if(rows != null) {
			params.put("pagenum", rows);//返回信息时，每⻚页包含的视频个数 注:允许范围为 1~100
		}else {
			params.put("pagenum", "100");
		}
		if(page != null) {
			params.put("pageindex", page);//当前的页码
		}else {
			params.put("pageindex", "1");
		}
		params.put("format", "json");
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOM_CREATE, params);
		
//		JSONObject object = JSONObject.parseObject(json);
//		JSONObject videos = object.getJSONObject("videos");
//		Integer itotal = videos.getInteger("total");
//		JSONArray array = JSONObject.parseArray(videos.getString("video"));
//		
//		List<VideoBO> listVideo = new ArrayList<VideoBO>();
//		for(int i = 0; i < array.size(); ++i) {
//			JSONObject jo = array.getJSONObject(i);
//			VideoBO vb = JSONObject.parseObject(jo.toString(), VideoBO.class);
//			List<ImageAlternateBO> listImage = JSONObject.parseArray(jo.getString("image-alternate"), ImageAlternateBO.class);
//			vb.setImagealternate(listImage);
//			listVideo.add(vb);
//		}
		
		return json;
	}
	
	/**
	 * 	编辑直播间
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomUpdate")
	@ResponseBody
	public String roomUpdate(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOM_UPDATE, params);
		
		return json;
	}
	
	/**
	 * 	关闭直播间
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomClose")
	@ResponseBody
	public String roomClose(HttpServletRequest request, HttpServletResponse response) {
		String roomid = request.getParameter("roomid");
		Map<String, String> params = new HashMap<String, String>();
		params.put("roomid", roomid);
		params.put("userid", UserUrlCon.USER_ID);
		
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOM_CLOSE, params);
		
		return json;
	}
	
	/**
	 * 	获取直播间列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomInfo")
	@ResponseBody
	public String roomInfo(HttpServletRequest request, HttpServletResponse response) {
		String pagenum = request.getParameter("pagenum");
		String pageindex = request.getParameter("pageindex");
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		params.put("pagenum", pagenum);
		params.put("pageindex", pageindex);
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOM_INFO, params);
		
		return json;
	}
	
	/**
	 * 	获取直播间信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomSearch")
	@ResponseBody
	public String roomSearch(HttpServletRequest request, HttpServletResponse response) {
		String roomid = request.getParameter("roomid");
		Map<String, String> params = new HashMap<String, String>();
		params.put("roomid", roomid);
		params.put("userid", UserUrlCon.USER_ID);
		
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOM_SEARCH, params);
		
		return json;
	}	
	
	/**
	 * 	获取直播列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("v2LiveInfo")
	@ResponseBody
	public String v2LiveInfo(HttpServletRequest request, HttpServletResponse response) {
		String roomid = request.getParameter("roomid");//直播间id
		String pagenum = request.getParameter("pagenum");//每页显示的个数
		String pageindex = request.getParameter("pageindex");//页码
		String starttime = request.getParameter("starttime");//查询起始时间
		String endtime = request.getParameter("endtime");//查询截止时间
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		params.put("roomid", roomid);
		params.put("pagenum", pagenum);
		params.put("pageindex", pageindex);
		params.put("starttime", starttime);
		params.put("endtime", endtime);
		
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.V2_LIVE_INFO, params);
		
		return json;
	}		
	
	/**
	 * 	查询回放列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("v2RecordInfo")
	@ResponseBody
	public String v2RecordInfo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.V2_RECORD_INFO, params);
		
		return json;
	}	
	
	/**
	 * 	查询回放信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("v2RecordSearch")
	@ResponseBody
	public String v2RecordSearch(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.V2_RECORD_SEARCH, params);
		
		return json;
	}	
	
	/**
	 * 	合并回放接口
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveMerge")
	@ResponseBody
	public String liveMerge(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_MERGE, params);
		
		return json;
	}
	
	/**
	 * 	获取正在直播的直播间列表
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomsBroadcasting")
	@ResponseBody
	public String roomsBroadcasting(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOMS_BROADCASTING, params);
		
		return json;
	}
	
	/**
	 * 	获取直播间直播状态
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomsPublishing")
	@ResponseBody
	public String roomsPublishing(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOMS_PUBLISHING, params);
		
		return json;
	}
	
	/**
	 * 	获取直播间连接数
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statisConnections")
	@ResponseBody
	public String statisConnections(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.STATIS_CONNECTIONS, params);
		
		return json;
	}	
	
	/**
	 * 	获取直播间模板信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("viewtemplateInfo")
	@ResponseBody
	public String viewtemplateInfo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.VIEWTEMPLATE_INFO, params);
		
		return json;
	}		
	
	/**
	 * 	获取直播间代码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("roomCode")
	@ResponseBody
	public String roomCode(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.ROOM_CODE, params);
		
		return json;
	}		
	
	/**
	 * 	获取直播间内用户进出信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statisUseraction")
	@ResponseBody
	public String statisUseraction(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.STATIS_USERACTION, params);
		
		return json;
	}		
	
	/**
	 * 	获取观看直播的统计信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("statisUserview")
	@ResponseBody
	public String statisUserview(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.STATIS_USERVIEW, params);
		
		return json;
	}	
	
	/**
	 * 	获取单个直播回放的观看统计信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("v2StatisReplayUseraction")
	@ResponseBody
	public String v2StatisReplayUseraction(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.V2_STATIS_REPLAY_USERACTION, params);
		
		return json;
	}		
	
	/**
	 * 	获取所有直播回放的观看统计信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("v2StatisReplay")
	@ResponseBody
	public String v2StatisReplay(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.V2_STATIS_REPLAY, params);
		
		return json;
	}		
	
	/**
	 * 	获取聊天信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveChatmsg")
	@ResponseBody
	public String liveChatmsg(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_CHATMSG, params);
		
		return json;
	}
	
	/**
	 * 	获取抽奖信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveLotterys")
	@ResponseBody
	public String liveLotterys(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_LOTTERYS, params);
		
		return json;
	}
	
	/**
	 * 	获取问答信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveQas")
	@ResponseBody
	public String liveQas(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_QAS, params);
		
		return json;
	}
	
	/**
	 * 	获取签到信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveRollcall")
	@ResponseBody
	public String liveRollcall(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_ROLLCALL, params);
		
		return json;
	}
	
	/**
	 * 	获取签到用户信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveRollcallViewers")
	@ResponseBody
	public String liveRollcallViewers(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_ROLLCALL_VIEWERS, params);
		
		return json;
	}
	
	/**
	 * 	获取问卷信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveQuestionnaires")
	@ResponseBody
	public String liveQuestionnaires(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_QUESTIONNAIRES, params);
		
		return json;
	}
	
	/**
	 * 	获取用户答卷信息
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("liveQuestionnaireViewers")
	@ResponseBody
	public String liveQuestionnaireViewers(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		String json = URLConUtil.lretrieve(DirectSeedingUrlCon.LIVE_QUESTIONNAIRE_VIEWERS, params);
		
		return json;
	}	
	
}
