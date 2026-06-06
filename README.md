# inflearn-spring-advanced

인프런 **김영한의 스프링 핵심 원리 - 고급편** 학습 저장소입니다. 강의 진행에 따라 `advanced`, `proxy`, `aop` 세 개의 하위 프로젝트로 구성되어 있습니다.

## 강의 / 학습 정보

- 강의: 스프링 핵심 원리 - 고급편 (김영한)
- 플랫폼: 인프런

## 사용 기술

- Java
- Spring Boot (멀티 프로젝트: `advanced`, `proxy`, `aop`)
- Spring AOP / AspectJ
- CGLIB, JDK Dynamic Proxy
- Lombok, JUnit 5
- Gradle (Groovy DSL)

## 학습한 내용 (코드 근거)

### advanced — 로그 추적기와 디자인 패턴
- 예제 애플리케이션 v0~v5: Controller/Service/Repository 계층 (`app/v0`~`v5`)
- 로그 추적기: `HelloTraceV1`/`V2`, `TraceId`, `TraceStatus` (`trace/hellotrace`)
- 동시성 문제와 `ThreadLocal`: `FieldLogTrace` vs `ThreadLocalLogTrace` (`trace/logtrace`, `trace/threadlocal`)
- 템플릿 메서드 패턴 (`trace/template`, `AbstractTemplate`)
- 전략 패턴 / 템플릿 콜백 패턴 (`trace/strategy`, `trace/callback`)

### proxy — 프록시와 동적 프록시
- 프록시 패턴 / 데코레이터 패턴 (`pureproxy`)
- 인터페이스 기반 / 구체 클래스 기반 프록시 (`v1_proxy`)
- JDK 동적 프록시, 리플렉션, `InvocationHandler` (`jdkdynamic`)
- CGLIB, `MethodInterceptor` (`cglib`)
- 스프링 `ProxyFactory`, Advice/Advisor/Pointcut (`v3_proxyfactory`, `advisor`)
- 빈 후처리기(`BeanPostProcessor`)를 통한 자동 프록시 (`v4_postprocessor`, `postprocessor`)
- `@Aspect`와 자동 프록시 생성기 (`v5_autoproxy`, `v6_aop`)

### aop — 스프링 AOP
- 포인트컷 표현식(execution 등) (`pointcut`, `ExecutionTest`)
- 어드바이스 종류와 적용 순서: `AspectV1`~`AspectV6Advice`
- `@annotation` 기반 AOP: `@Trace`, `@Retry` 커스텀 애노테이션 (`exam`)
- 프록시 방식의 한계와 내부 호출 문제 (`internalcall`)
- 프록시 캐스팅·DI 주의점 (`proxyvs`)

## 프로젝트 구조

```
inflearn-spring-advanced/
├── advanced/   # 로그 추적기, 템플릿 메서드/전략/템플릿 콜백 패턴, ThreadLocal
├── proxy/      # 프록시·데코레이터 패턴, JDK 동적 프록시, CGLIB, ProxyFactory, 빈 후처리기
└── aop/        # 스프링 AOP (포인트컷, 어드바이스, @Aspect, 내부 호출)
```
