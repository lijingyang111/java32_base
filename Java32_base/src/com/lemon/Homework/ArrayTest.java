package com.lemon.Homework;

/**
 * @Project: java32
 * @Author: ljy
 * @Create: 2021-08-07 19:12
 * @Desc： 数组
 **/

public class ArrayTest {
    public static void main(String[] args) {
        String[] arrStr1 = {"我","是","最","棒","的"};
        String[] arrStr2 =new String[5];
        arrStr2[0] = "我";
        arrStr2[1] = "是";
        arrStr2[2] = "最";
        arrStr2[3] = "棒";
        arrStr2[4] = "的";

        int[] arrInt1 = {100,200,300,400,500};
        int[] arrInt2 = new int[5];
        arrInt2[0] = 100;
        arrInt2[1] = 200;
        arrInt2[2] = 300;
        arrInt2[3] = 400;
        arrInt2[4] = 500;

        String[][] twoArrayStr1= new String[2][2];
        twoArrayStr1[0][0] ="第一个";
        twoArrayStr1[0][1] ="二维";
        twoArrayStr1[1][0] ="数";
        twoArrayStr1[1][1] ="组";

        String[][] twoArrayStr2= {{"第一个","二维"},{"数","组"}};


        int[][] twoArrayInt1= new int[3][2];
        twoArrayInt1[0][0] =50;
        twoArrayInt1[0][1] =60;
        twoArrayInt1[1][0] =70;
        twoArrayInt1[1][1] =80;
        twoArrayInt1[2][0] =90;
        twoArrayInt1[2][1] =100;

        int[][] twoArrayInt2= {{50,60},{70,80},{90,100}};


    }

}
