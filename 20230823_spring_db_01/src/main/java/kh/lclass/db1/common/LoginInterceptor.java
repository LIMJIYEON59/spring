package kh.lclass.db1.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

//@Component("loginInterceptor")
//상속 받음
public class LoginInterceptor implements HandlerInterceptor{
	
	/*
	 * @Override public boolean preHandle(HttpServletRequest request,
	 * HttpServletResponse response, Object handler) throws Exception { Object obj =
	 * request.getSession().getAttribute("SsLoginId"); if(obj == null) { //로그인 되어있지
	 * 않은 상태 response.sendRedirect(request.getContextPath()+"/login"); // 타겟 URL요청으로
	 * 가지 않음. return false;
	 * 
	 * }
	 * 
	 * // return true : 타겟URL의 mapping된 타겟메소드 호출하러감. //return
	 * HandlerInterceptor.super.preHandle(request, response, handler); return true;
	 * //위에 코드 대신에 씀 }
	 */
}
