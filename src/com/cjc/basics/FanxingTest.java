package com.cjc.basics;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017-12-11.
 */
public class FanxingTest {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("cjc");
        Class c = a.getClass();
        try {
            Method method = c.getMethod("add", Object.class);
            method.invoke(a, 100);
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
