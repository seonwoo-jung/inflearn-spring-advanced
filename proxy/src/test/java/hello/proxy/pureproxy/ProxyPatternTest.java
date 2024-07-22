package hello.proxy.pureproxy;

import hello.proxy.pureproxy.code.CacheProxy;
import hello.proxy.pureproxy.code.ProxyPatternClient;
import hello.proxy.pureproxy.code.RealSubject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    void noProxyTest() {
//        RealSubject realSubject = new RealSubject();
//        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(new RealSubject());

        client.execute();
        client.execute();
        client.execute();
    }

    @Test
    void cacheProxyTest() {
        CacheProxy cacheProxy = new CacheProxy(new RealSubject());
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);
        client.execute();
        client.execute();
        client.execute();
    }
}
