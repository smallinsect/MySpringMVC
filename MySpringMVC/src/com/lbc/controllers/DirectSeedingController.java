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
import com.cod.constants.UserUrlCon;
import com.cod.constants.VideoUrlCon;
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
	
}
