package com.aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Syslog;
import com.mapper.SyslogMapper;

@Component
@Aspect
public class testAspect {
	// private static Date date;
	private long start = 0;
	private long end = 0;
	@Autowired
	SyslogMapper syslogDao;
	
	@Around("execution(* com.controller.MemberController.*(..))")
	public Object aspect_test(ProceedingJoinPoint point) {
		Syslog syslog = new Syslog();
		try {
			syslog.setAction_time(new Date());
			syslog.setAction_name(point.getSignature().getName().toString());
			Object o = point.proceed();
			return o;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			syslog.setAction_exception(e.getMessage());
			return null;
		}finally {
			syslogDao.runlog(syslog);
		}
	}
//	  @Around("execution(* com.controller.MapperController.getMemberPages(..))")
//	  public Object aspect_test_01(ProceedingJoinPoint point) throws Throwable {
//		  System.out.println("before"); 
//		  Object o =point.proceed(); 
//		  System.out.println("after"); 
//		  return o;
//	  }
//	 
//
//	@Before("execution(* com.controller.MemberController.getMemberPages(..))")
//	public void aspect_test_02() {
//		start = new Date().getTime();
//		//System.out.println(start);
//	}
//
//	
////	@After("execution(* com.controller.MapperController.getMemberPages(..))")
////	public void aspect_test_03(JoinPoint point) throws Throwable{
////		end = new Date().getTime();
////		System.out.println(point.getTarget());
////		System.out.println((end - start)/1000 + "秒");
////
////	}
//	@AfterThrowing("execution(* com.controller.MemberController.getMemberPages(..))")
//	public void aspect_test_04(JoinPoint point) throws Throwable {
//		throw new Exception("异常");
//	}
//
//	@AfterReturning("execution(* com.controller.MemberController.getMemberPages(..))")
//	public void aspect_test_05(JoinPoint point) {
//		end = new Date().getTime();
//		System.out.println(point.getTarget());//com.controller.MemberController@533ddf16
//		System.out.println(point.getKind());//method-execution
//		System.out.println(point.getThis());//com.controller.MemberController@533ddf16
//		System.out.println(point.getArgs());//[Ljava.lang.Object;@12317bb2
//		System.out.println(point.getSignature());//PageInfo com.controller.MemberController.getMemberPages(int)
//		System.out.println(point.getSignature().getDeclaringTypeName());//com.controller.MemberController
//		System.out.println(point.getSignature().getModifiers());//1
//		System.out.println(point.getSourceLocation());//org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint$SourceLocationImpl@6fbf13b8
//		System.out.println(point.getStaticPart());//execution(PageInfo com.controller.MemberController.getMemberPages(int))
//		System.out.println("运行时间"+(end - start)/1000 + "秒");
//
//	}
}
