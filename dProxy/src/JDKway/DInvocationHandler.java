package JDKway;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DInvocationHandler implements InvocationHandler {

    private final Object target;

    public DInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before"+method.getName());
        Object res = method.invoke(target, args);
        System.out.println("after"+method.getName());
        return res;
    }
}
