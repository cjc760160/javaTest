package com.cjc.basics;

import java.util.Calendar;

/**
 * Created by Administrator on 2017-11-28.
 */
public class GetDate {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        int day = ca.get(Calendar.DATE);
        System.out.println(day);
    }
}
