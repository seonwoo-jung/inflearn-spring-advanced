package hello.advanced.trace.study;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class TemplateMethodPattern {

    public void execute() {
        log.info("추상 클래스 시작...");
        call();
        log.info("추상 클래스 종료...");
    }

    protected abstract void call();
}
