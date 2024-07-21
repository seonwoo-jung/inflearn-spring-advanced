package hello.advanced.trace.strategy.code.template;

import static java.lang.System.currentTimeMillis;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {
	public void execute(Callback callback) {
		long startTime = currentTimeMillis();
		// 비지니스 로직 실행
		callback.call(); // 위임
		// 비지니스 로직 종료
		long endTime = currentTimeMillis();
		long resultTime = endTime - startTime;
		log.info("resultTime = {}", resultTime);
	}
}
