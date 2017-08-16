package com.core.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserInterceptor implements HandlerInterceptor {

	/**
	 * ���������֮��Ž��е���
	 */
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion���ã�");
	}

	/**
	 * �����󱻴���֮��Ž��е���
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3:���޸�Ҫ�������ͼ
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		arg3.setViewName("");//���÷��ص�Ŀ���ļ�
		System.out.println("postHandle���ã�");
	}

	/**
	 * �����󱻴���֮ǰ����
	 * @param arg2:�����ص������Ŀ�����
	 * @return false ���󲻻ᴫ�ݸ�����������������������Ҳ���ᱻ����
	 */
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("preHandle���ã�");
		return false;
	}

}
