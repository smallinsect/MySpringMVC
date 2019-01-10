package com.mvc.actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.constants.UserInfo;
import com.mvc.utils.URLConUtil;

@Controller
public class VideoAction {
	
	@RequestMapping("getVideoList")
	@ResponseBody
	public String getVideoList(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserInfo.USER_ID);
		params.put("num_per_page", "100");
		params.put("page", "1");
		params.put("format", "json");
		String json = URLConUtil.retrieve("http://spark.bokecc.com/api/playlists", params);
		return json;
	}
	
}
