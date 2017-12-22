package com.cjc.basics;

/**
 * Created by Administrator on 2017-12-19.
 */
public class Person {
    public int age;
    public String name;

    public Person() {
        System.out.println("父类的构造方法被调用");
        age = 100;
        name = "Petter";
    }

    public String getAge() {
        return "我今年25";
    }
}
