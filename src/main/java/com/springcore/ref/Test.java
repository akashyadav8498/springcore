package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String... s)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        System.out.println(context.getBean("aref"));
    }
}
