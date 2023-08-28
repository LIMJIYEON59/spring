package kh.lclass.db1.common;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceLogXml {
	private static final Logger logger = LoggerFactory.getLogger(AdviceLog.class); // final 아무도 못 바꾸게한다.

	// @Pointcut("execution(타켓메소드)")
	// .. 매개변수 없거나 여러개 있거나..
	// * <-이거는 1개 이상일 때 쓴다.
	@Pointcut("execution(public * kh.lclass.db1..*Dao.*(..))") // 메소드안에는 접근제한자, 리턴자료형(*), 클래스명, 메소드명 //*Dao 블라블라 클래스명이라는
																// 소리
	public void daoPointCut() {
	}

	@Pointcut("execution(public * kh.lclass.db1..*Service.*(..))")
	public void servicePointCut() {
	}

	@Pointcut("execution(public * kh.lclass.db1..*Controller.*(..))")
	public void controllerPointCut() {
	}


	
	@Around("daoPointCut()")
	public Object aroundDaoLog(ProceedingJoinPoint pjp) throws Throwable {
		logger.debug("▷▷[" + pjp.getThis() + ":" + pjp.getSignature().getName() + "]");
		// 타겟메소드로 전달되는 매개인자들
		Object[] args = pjp.getArgs();
		for (int i = 0; i < args.length; i++) {
			logger.debug("▷▷-args[" + i + "] " + args[i] + "");
		}
		
		Object robj = null;	//타겟메소드로부터 return 값을 받아 저장할 공간
		robj = pjp.proceed();	// 타겟메소드 실행!!! Around 중요 메소드
		logger.debug("▷▷[ Dao ▷]" + robj);
		return robj; // 타겟메소드를 호출한 메소드에 return함
	}

	@Around("servicePointCut()")
	public Object aroundSrvLog(ProceedingJoinPoint pjp) throws Throwable {
		Object robj = null; // 타겟메소드로부터 return 값을 받아 저장할 공간

		logger.debug("▷▷[" + pjp.getThis() + ":" + pjp.getSignature().getName() + "]");
		// 타겟메소드로 전달되는 매개인자들
		Object[] args = pjp.getArgs();
		for (int i = 0; i < args.length; i++) {
			logger.debug("▷▷-args[" + i + "] " + args[i] + "");
		}
		
		robj = pjp.proceed();	//타겟메소드로부터 return 값을 받아 저장할 공간
		logger.debug("▷▷[ Srv ▷]" + robj);
		return robj; // 타겟메소드를 호출한 메소드에 return함
	}

	@Around("controllerPointCut()")
	public Object aroundCtrLog(ProceedingJoinPoint pjp) throws Throwable {
		Object robj = null; // 타겟메소드로부터 return 값을 받아 저장할 공간

		logger.debug("▷▷[" + pjp.getThis() + ":" + pjp.getSignature().getName() + "]");
		// 타겟메소드로 전달되는 매개인자들
		Object[] args = pjp.getArgs();
		for (int i = 0; i < args.length; i++) {
			logger.debug("▷▷-args[" + i + "] " + args[i] + "");
		}
		
		robj = pjp.proceed(); //타겟메소드로부터 return 값을 받아 저장할 공간
		logger.debug("▷▷[ Ctr ▷]" + robj);
		return robj; // 타겟메소드를 호출한 메소드에 return함
	}
}

