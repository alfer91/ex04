package org.zerock.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect   // 해당 클래스가 관심사(Aspect)를 구현한 Advice 임을 나타냄
@Log4j
@Component   // Bean 등록을 위해 사용
public class LogAdvice {
	
	@Before("execution(* org.zerock.service.SampleService*.*(..))") /* AspectJ의 표현식 : 접근제한자 클래스.메서드 */
	public void logBefore() {
		
		log.info("======================");
	}
}
