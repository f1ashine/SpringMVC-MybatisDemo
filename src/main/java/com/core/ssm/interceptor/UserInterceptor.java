package com.core.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserInterceptor implements HandlerInterceptor {

	/**
	 * 在请求结束之后才进行调用
	 */
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion调用！");
	}

	/**
	 * 在请求被处理之后才进行调用
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3:可修改要传输的视图
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		arg3.setViewName("");//设置返回的目标文件
		System.out.println("postHandle调用！");
	}

	/**
	 * 在请求被处理之前调用
	 * @param arg2:被拦截的请求的目标对象
	 * @return false 请求不会传递给控制器，后续的两个方法也不会被调用
	 */
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("preHandle调用！");
		return false;
	}

}
