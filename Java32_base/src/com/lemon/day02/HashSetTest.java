package com.lemon.day02;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Project: java32
 * @Author: ljy
 * @Create: 2021-08-07 21:22
 * @Desc： HashSet
 **/

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("zhangsan");
        hashSet.add("nihao");
        hashSet.add("zhangsan");
        System.out.println(hashSet);

        System.out.println(hashSet.size());
        for(String ele:hashSet){
            System.out.println(ele);
        }
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("nihao");
        System.out.println(arrayList);

    }
}
