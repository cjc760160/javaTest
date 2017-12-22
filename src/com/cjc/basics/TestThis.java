package com.cjc.basics;

/**
 * Created by cjc on 2017-12-19.
 */
public class TestThis {
    private int number = 100;

    public TestThis CreatNumber() {
        number++;
        return this;
    }

    public int getNumber() {
        return number;
    }


    public static void main(String[] args) {
        TestThis testThis = new TestThis();
        System.out.println("当前number的值是：" + testThis.CreatNumber().CreatNumber().getNumber());
    }
}
