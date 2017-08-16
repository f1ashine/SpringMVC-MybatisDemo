package com.core.ssm.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONObject;
import com.core.ssm.dao.IUserDao;
import com.core.ssm.pojo.ResultMap;
import com.core.ssm.service.IUserService;

@Repository("IUserService")
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	IUserDao userDao;
	
	public ResultMap getUserById(int id) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("id", 1);
		Map<String,Object> res = userDao.getUserById(map);
		if(res!=null) {
			return new ResultMap(ResultMap.SUCCESS,"查询成功",res);
		}else {
			return new ResultMap(ResultMap.FAILED,"查询失败");
		}
	}
	
}
