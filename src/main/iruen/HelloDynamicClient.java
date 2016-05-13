package iruen;

import java.lang.reflect.Proxy;

/**
 * Created by donghoon on 2016. 5. 10..
 */
public class HelloDynamicClient {

    public void ex() {
        Hello helloProxy = (Hello) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Hello.class}, new HelloDynamicHandler(new HelloImpl()));
        String proxyVal = helloProxy.sayHello("donghoon");
        System.out.println(proxyVal);
    }

    public static void main(String[] args) {
        HelloDynamicClient client = new HelloDynamicClient();
        client.ex();
    }
}
