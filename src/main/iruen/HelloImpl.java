package iruen;

/**
 * Created by donghoon on 2016. 5. 10..
 */
public class HelloImpl implements Hello {

    @Override
    public String sayHello(String name) {
        String val = "Hello, " + name;
        System.out.println(val);
        return val;
    }

    @Override
    public String sayHi(String name) {
        String val = "Hi, " + name;
        System.out.println(val);
        return val;
    }

    @Override
    public String sayThanks(String name) {
        String val = "Thannks. " + name;
        System.out.println(val);
        return val;
    }
}
