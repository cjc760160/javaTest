package com.cjc.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017-12-01.
 */
public class HashMapTest {
    public static void main(String[] args) {
        int[] a = {2, 3, 2, 2, 1, 4, 2, 2, 2, 7, 9, 6, 2, 2, 3, 1, 0};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int tmp = map.get(a[i]);
                tmp += 1;
                map.put(a[i], tmp);
            } else {
                map.put(a[i], 1);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer s : set) {
            if (map.get(s) >= a.length / 2) {
                System.out.println(map.get(s));
            }
        }

    }
}
