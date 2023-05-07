package hello.advanced.trace.study;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    /**
     * 템플릿 메서드 패턴
     */
    @Test
    void templateMethodV1() {
        TemplateMethodPattern template1 = new SubClassLogic1();
        template1.execute();

        System.out.println();

        TemplateMethodPattern template2 = new SubClassLogic2();
        template2.execute();
    }

    /**
     * 익명 내부 클래스
     */
    @Test
    void templateMethodV2() {
        TemplateMethodPattern template1 = new TemplateMethodPattern() {
            @Override
            protected void call() {
                log.info("비지니스 로직1 실행");
            }
        };
        log.info("클래스 이름 = {}", template1.getClass());
        template1.execute();
    }

    @Test
    void callGeneric() {
        GenericStudy study = new GenericStudy();
        Integer param = 12345;
        Integer newParam = study.call(param);
        System.out.println("getClass() = " + newParam.getClass());
    }
}
