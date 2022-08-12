package org.genspark;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnosSpring.xml");
        AnnoStudent student = (AnnoStudent) context.getBean("annoStudent");
        System.out.println(student);


    }
}
