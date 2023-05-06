package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

import static java.lang.System.currentTimeMillis;

/**
 * 전략을 파라미터로 전달 받는 방식
 */
@Slf4j
public class ContextV2 {

    public void execute(Strategy strategy) {
        long startTime = currentTimeMillis();
        // 비지니스 로직 실행
        strategy.call(); // 위임
        // 비지니스 로직 종료
        long endTime = currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }
}
