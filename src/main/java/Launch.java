import core.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-core-context.xml");
        Human h1 = applicationContext.getBean(Human.class);
        System.out.println(h1);
        System.out.println(h1.dog);
        Human h2 = applicationContext.getBean(Human.class);
        System.out.println(h2);
        System.out.println(h2.dog);
    }

}
