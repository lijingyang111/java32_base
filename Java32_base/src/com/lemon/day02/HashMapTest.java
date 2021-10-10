package com.lemon.day02;

import java.util.Collection;
import java.util.HashMap;

/**
 * @Project: java32
 * @Author: ljy
 * @Create: 2021-08-07 21:50
 * @Desc： HashMap
 **/

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("id",111);
        hashMap.put("age",30);
        hashMap.put("age",89);
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("id"));
//多态：父接口=实现类
        Collection<Integer> values = hashMap.values();

        for(Integer it:values)
        {
            System.out.println(it);
        }

        if(hashMap.containsKey("age"))
        {
            Integer i = hashMap.get("age");
        }


    }
}
