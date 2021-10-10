package com.lemon.day02;

/**
 * @Project: java32
 * @Author: ljy
 * @Create: 2021-08-06 22:08
 * @Desc： Student
 **/

public class Student {

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
