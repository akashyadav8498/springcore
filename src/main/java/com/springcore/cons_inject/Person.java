package com.springcore.cons_inject;

import com.springcore.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {
    private String name;
    private int person_id;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", person_id=" + person_id +
                ", st=" + st +
                '}';
    }

    private Student st;

    public Person(String name, int person_id, Student std) {
        this.name = name;
        this.person_id = person_id;
        st = std;

    }

    public static void main(String... s)
    {
        System.out.println(new ClassPathXmlApplicationContext("constconfig.xml").getBean("person"));
    }
}
