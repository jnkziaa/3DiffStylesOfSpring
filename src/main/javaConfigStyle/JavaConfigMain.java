import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        JavaConfigStudent annoStudent = context.getBean(JavaConfigStudent.class);

        System.out.println(annoStudent);

    }
}
