import com.dubbo.service.DomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("consumer demo start");
        DomeService demoService;
        demoService = context.getBean(DomeService.class);
        System.out.println("consumer demo");
        demoService.getDome("1112");

    }
}
