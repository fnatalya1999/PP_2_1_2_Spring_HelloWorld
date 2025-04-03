import Model.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext.getBean("helloWorld", HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean("helloWorld", HelloWorld.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Сравнение HelloWorld:" + (bean1 == bean2));
        System.out.println("Сравнение Cat:" + (cat1 == cat2));
    }
}