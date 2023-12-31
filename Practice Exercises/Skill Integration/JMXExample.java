import javax.management.*;
import java.lang.management.ManagementFactory;

public class JMXExample {
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        ObjectName name = new ObjectName("com.example:type=Hello");
        Hello mbean = new Hello();
        mbs.registerMBean(mbean, name);

        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }
}

interface HelloMBean {
    void sayHello();
}

class Hello implements HelloMBean {
    public void sayHello() {
        System.out.println("Hello, JMX!");
    }
}
