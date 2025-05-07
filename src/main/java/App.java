import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean3 = (Cat) applicationContext.getBean("cat");

        Cat bean4 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean.getMessage());

        boolean areHelloWorldsEqual = (bean == bean2);
        boolean areCatsEqual = (bean3 == bean4);
        System.out.println("Сравнение HelloWorld: " + areHelloWorldsEqual);
        System.out.println("Сравнение Cat: " + areCatsEqual);



    }
}