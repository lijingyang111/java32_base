package com.lemon.day02;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Project: java32
 * @Author: ljy
 * @Create: 2021-08-06 20:13
 * @Desc： String
 **/

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> arr= new ArrayList<Student>();
        Student s1 = new Student("li",23);
        Student s2=new Student("yang",34);
        arr.add(s1);
        arr.add(s2);
        System.out.println(arr);
        //1.索引
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        //2.加强for
        for (Student stu:arr)
        {
            System.out.println(stu);
        }
        //3.迭代器
        Iterator<Student> it= arr.iterator();
        while(it.hasNext())
        {
            Student a=it.next();
            System.out.println(a);
        }


        //迭代器

        ArrayList<Integer> aaa= new ArrayList<>();
        aaa.add(123);
        aaa.add(234);

        Iterator<Integer> it1= aaa.iterator();
        while(it1.hasNext())
        {
            int a=it1.next();
            System.out.println(a);
        }


    }
}
