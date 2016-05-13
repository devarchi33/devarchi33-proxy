package iruen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by donghoon on 2016. 5. 10..
 */
public class HelloDynamicHandler implements InvocationHandler {

    private HelloImpl hello;

    public HelloDynamicHandler(HelloImpl hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String retVal = (String) method.invoke(hello, args);
        return retVal.toUpperCase();
    }
}
