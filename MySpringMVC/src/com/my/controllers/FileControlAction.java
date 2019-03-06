package com.my.controllers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileControlAction {
	
	@RequestMapping("saveFile1")
	@ResponseBody
	public String saveFile1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		return null;
	}
}
