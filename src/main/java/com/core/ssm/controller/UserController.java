package com.core.ssm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.core.ssm.pojo.ResultMap;
import com.core.ssm.service.IUserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping(value="query.do",method=RequestMethod.GET)
	public @ResponseBody JSONObject query(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String str = request.getParameter("id");
		System.out.println();
		ResultMap map = this.userService.getUserById(Integer.parseInt(str));
		JSONObject obj = new JSONObject();
		if(map.getResultCode()==ResultMap.SUCCESS) {
			obj.put("res", "1");
			obj.put("msg", map.getResultTO());
			return obj;
		}else {
			obj = new JSONObject();
			obj.put("res",-1);
			return obj;
		}
	}

//	public String toIndex(HttpServletRequest request,Model model){
//		String str = request.getParameter("id");
//		String res = JSONObject.toJSONString(this.userService.getUserById(Integer.parseInt(str)));
//		model.addAttribute("user", res);
//		return "userlist";
//	}
//	
	
}
