package com.springcore.standalone_collections;

import com.springcore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Person {

    List<String> friends;

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                '}';
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standcol.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());

    }

}
