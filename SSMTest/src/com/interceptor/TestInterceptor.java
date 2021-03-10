package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor{

//	SpringMvc��������
//
//	��һ��:�û���������ǰ�˿�������DispatcherServlet��
//          preHandle()  true ����ִ��   false ��ֹ
//	�ڶ�����ǰ�˿�������������ӳ������HandlerMappering��ȥ���Ҵ�������Handle����ͨ��xml���û���ע����в���
//
//	���������ҵ��Ժ�����ӳ������HandlerMappering����ǰ�˿���������ִ������HandlerExecutionChain��
//
//	���Ĳ���ǰ�˿�������DispatcherServlet�����ô�������������HandlerAdapter��ȥִ�д�������Handler��
//
//	���岽��������������ȥִ��Handler
//
//	��������Handlerִ���������������������ModelAndView��ִ�п��Ʋ㷽����
//         postHandle
//	���߲�����������������ǰ�˿���������ModelAndView
//
//	�ڰ˲���ǰ�˿�����������ͼ��������ViewResolver��ȥ������ͼ����
//
//	�ھŲ�����ͼ��������ǰ�˿���������View
//
//	��ʮ����ǰ�˿���������ͼ������Ⱦ
//
//	��ʮһ����ǰ�˿��������û���Ӧ���
//	afterCompletion
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println(arg0.getAttribute("user"));
		System.out.println("afterCompletion run");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle run");

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle run"+arg0.getRequestURI());  //arg0.getRequestURI() ��ʾ ���ص�����·��
		
		return true;  //true/false �Ƿ����ظ�����
	}

}

