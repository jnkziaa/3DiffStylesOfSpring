package annotationStyle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationStyle/resources/AnnosSpring.xml");
        AnnoStudent student = (AnnoStudent) context.getBean("annoStyleStudent");
        System.out.println(student);

    }
}
