package hello.advanced.trace.study;

public class GenericStudy {
    public <T> T call(T param) {
        System.out.println("params = " + param);
        return param;
    }
}
