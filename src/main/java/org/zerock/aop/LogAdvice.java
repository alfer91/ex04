package org.zerock.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect   // 해당 클래스가 관심사(Aspect)를 구현한 Advice 임을 나타냄
@Log4j
@Component   // Bean 등록을 위해 사용
public class LogAdvice {
	
	@Before("execution(* org.zerock.service.SampleService*.*(..))")  /* AspectJ의 표현식 : 접근제한자 클래스.메서드 */
	public void logBefore() {
		
		log.info("======================");
	}
	
	/* 어떤 위치에 Advice를 적용할 것인지를 결정하는 Pointcut */
	@Before("execution(* org.zerock.service.SampleService*.doAdd(String, String)) && args(str1, str2)")   //메서드와 파라미터 타입 지정, 변수명 지정
	public void logBeforeWithParam(String str1, String str2) {  // Pointcut에 지정된 변수를 파라미터로 얻음
		log.info("str1: " + str1);
		log.info("str2: " + str2);
	}
}
