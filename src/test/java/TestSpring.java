import com.springTest.Beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2019/2/16.
 */
public class TestSpring {
    public static void main(String[] args) {
        String source = "spring-config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(source);
        Beans be = (Beans) applicationContext.getBean("beans");
        System.out.println(be);
    }
}
