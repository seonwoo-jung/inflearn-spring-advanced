package hello.advanced.trace.study;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassLogic1 extends TemplateMethodPattern {

    @Override
    protected void call() {
        log.info("SubClassLogic Start...");
    }
}
