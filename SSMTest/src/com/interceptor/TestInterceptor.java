package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor{

//	SpringMvc工作流程
//
//	第一步:用户发起请求到前端控制器（DispatcherServlet）
//          preHandle()  true 继续执行   false 终止
//	第二步：前端控制器请求处理器映射器（HandlerMappering）去查找处理器（Handle）：通过xml配置或者注解进行查找
//
//	第三步：找到以后处理器映射器（HandlerMappering）像前端控制器返回执行链（HandlerExecutionChain）
//
//	第四步：前端控制器（DispatcherServlet）调用处理器适配器（HandlerAdapter）去执行处理器（Handler）
//
//	第五步：处理器适配器去执行Handler
//
//	第六步：Handler执行完给处理器适配器返回ModelAndView（执行控制层方法）
//         postHandle
//	第七步：处理器适配器向前端控制器返回ModelAndView
//
//	第八步：前端控制器请求视图解析器（ViewResolver）去进行视图解析
//
//	第九步：视图解析器像前端控制器返回View
//
//	第十步：前端控制器对视图进行渲染
//
//	第十一步：前端控制器向用户响应结果
//	afterCompletion
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
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
		System.out.println("preHandle run"+arg0.getRequestURI());  //arg0.getRequestURI() 表示 拦截的请求路径

		return true;  //true/false 是否拦截该请求
	}

}

