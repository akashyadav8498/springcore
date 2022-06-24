package com.springcore.autowire;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.*;

public class method1 {


    public static void main(String args[]) throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("ClasspathXMLApplicationContext.txt"));
        System.setOut(o);


        try {
            Class cls = Class.forName("org.springframework.context.support.ClassPathXmlApplicationContext");

            Constructor[] c = cls.getConstructors();
            System.out.println("All the constructors---->");
            System.out.println();
            for(int i=0; i<=c.length-1;i++)
                  System.out.println(c[i]);

            Field[] f = cls.getDeclaredFields();
            System.out.println();
            System.out.println("All the declared fields---->");
            System.out.println();
            for(int i=0; i<=f.length-1;i++)
                System.out.println(f[i]);

            Field[] f1 = cls.getFields();
            System.out.println();
            System.out.println("All the fields---->");
            System.out.println();
            for(int i=0; i<=f1.length-1;i++)
                System.out.println(f1[i]);

            Method[] m = cls.getDeclaredMethods();
            System.out.println();
            System.out.println("All the declared methods---->");
            System.out.println();
            for(int i=0; i<=m.length-1;i++)
                System.out.println(m[i]);

            Method[] m1 = cls.getMethods();
            System.out.println();
            System.out.println("All the methods---->");
            System.out.println();
            for(int i=0; i<=m1.length-1;i++)
                System.out.println(m1[i]);
            System.out.println();
            System.out.println(cls.toString());

            }



        catch (Throwable e) {
            System.err.println(e);
        }
    }
}