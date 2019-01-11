package com.mvc.actions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.constants.UserUrlCon;
import com.mvc.utils.URLConUtil;

@Controller
public class UserAction {
	
//	@RequestMapping(value="/getUserInfo", produces="application/json; charset=utf-8")
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public String getUserInfo() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", UserUrlCon.USER_ID);
		params.put("format", "json");
		String str = URLConUtil.retrieve("http://spark.bokecc.com/api/user", params);
		return str;
	}
	
}
