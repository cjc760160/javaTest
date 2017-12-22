package com.cjc.basics;

import java.util.*;

/**
 * Created by Administrator on 2017-11-28.
 */
public class TestHashMap {
    public static void main(String[] args) {
        /*初始化map*/
        Map<String, Integer> map = new HashMap<>();
        System.out.println("HashMap的初始值：" + map.size());
        System.out.println("HashMap是否为空：" + (map.isEmpty() ? "是" : "否"));

        /*像map添加元素*/
        map.put("cjc", 12);
        map.put("wxh", 1223);
        map.put("uuu", 1223);
       /* System.out.println(map.size());

        *//*遍历map中的元素*//*
       *//* Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + " " + map.get(s) + " " + "HashCode:" + s.hashCode());
        }

        *//**//*检测是否存在某个key*//**//*
        System.out.println("cjc是否存在:" + (map.containsKey("cjc") ? "存在" : "不存在"));
        System.out.println("cjc是否存在:" + (map.containsValue(1223) ? "存在" : "不存在"));*/
/*
        Set keys = map.keySet();
        if (keys != null) {
            Iterator iterator = keys.iterator();
            while (iterator.hasNext()) {
                Object key = iterator.next();
                Object value = map.get(key);
                System.out.println(value);
            }
        }*/

        Set entries = map.entrySet();
        if (entries != null) {
            Iterator iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                Object key = entry.getKey();
                Object value = entry.getValue();

            }
        }

    }


}
