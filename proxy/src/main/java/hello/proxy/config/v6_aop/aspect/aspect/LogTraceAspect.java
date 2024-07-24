package hello.proxy.config.v6_aop.aspect.aspect;

import hello.proxy.trace.TraceStatus;
import hello.proxy.trace.logtrace.LogTrace;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class LogTraceAspect {

	private final LogTrace logTrace;

	public LogTraceAspect(LogTrace logTrace) {
		this.logTrace = logTrace;
	}

	// 이 메서드가 하나의 advisor
	@Around("execution(* hello.proxy.app..*(..))") // poinctcut
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		// advice
		TraceStatus status = null;

		try {
			String message = joinPoint.getSignature().toShortString();
			status = logTrace.begin(message);

			// 로직 호출
			Object result = joinPoint.proceed();

			logTrace.end(status);
			return result;

		} catch (Exception e) {
			logTrace.exception(status, e);
			throw e;
		}
	}
}
