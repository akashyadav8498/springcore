package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp {

    int a;


    Address address;

    public Emp(Address address) {
        this.address = address;
    }


    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
@Autowired
    public void set(Address address) {
        this.address = address;
    }


    public Emp() {
    }

    public static void main(String... s)
    {
        System.out.println(new ClassPathXmlApplicationContext("autoconfig.xml").getBean("emp"));

    }
}
