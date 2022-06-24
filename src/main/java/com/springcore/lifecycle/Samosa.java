package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Samosa {



    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        context.registerShutdownHook();



    }

    public void init()
    {
        System.out.println("init!!!!");
    }

    public void destroy()
    {
        System.out.println("destroy!!!!");
    }

    private double price;

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public Samosa() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
