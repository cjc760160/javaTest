package com.cjc.basics;

import sun.applet.Main;

/**
 * Created by cjc on 2017-12-19.
 */
public class Teacher extends Person {
    public int age = 0;
    public String name = "jully";

    public Teacher() {
        System.out.println("Teacher的构造方法被调用");
        this.age = super.age;
       this.name = super.name;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher.age);
        System.out.println(teacher.name);
        System.out.println(teacher.getAge());
    }

}
