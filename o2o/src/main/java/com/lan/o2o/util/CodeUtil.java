package com.lan.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 验证码校验
 * @Descripton:TODO
 * @author KK
 * @version V1.0
 * @date 2021年3月7日下午9:48:56
 */
public class CodeUtil {
	public static boolean checkVerifyCode(HttpServletRequest request) {
		String verifyCodeExpected = (String)request.getSession().getAttribute(
				com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
		if(verifyCodeActual == null || !verifyCodeActual.equalsIgnoreCase(verifyCodeExpected)) {
			return false;
		}
		return true;
	}
}
