package hello.proxy;

import hello.proxy.config.AppV1Config;
import hello.proxy.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
@Import({AppV1Config.class, AppV2Config.class})
/**
 * scanBasePackages는 ComponentScan과 동일한 기능
 * 기본은 main 메서드의 패키지와 하위 패키지를 componentScan한다.
 */
@SpringBootApplication(scanBasePackages = "hello.proxy.app")
public class ProxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}
}
