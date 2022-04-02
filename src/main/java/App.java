import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println("Это один и тот же объект? " + (bean1==bean2));
        System.out.println("Ссылка на первый объект: " + bean1);
        System.out.println("Ссылка на второй объект: " + bean2);
        System.out.println("___________________________________");
        System.out.println(cat1.getMessage());
        System.out.println(cat2.getMessage());
        System.out.println("Это один и тот же объект? " + (cat1==cat2));
        System.out.println("Ссылка на первый объект: " + cat1);
        System.out.println("Ссылка на второй объект: " + cat2);

        
    }
}