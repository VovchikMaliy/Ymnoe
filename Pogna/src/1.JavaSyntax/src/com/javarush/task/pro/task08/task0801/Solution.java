package com.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

/* 
Утильный класс: часть 1
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(sin(60));
    }


    public static double sin(double a) {
        a = Math.toRadians(a);
        return Math.sin(a);
    }

    public static double cos(double a) {
        a = Math.toRadians(a);
        return Math.cos(a);
    }

    public static double tan(double a) {
        a = Math.toRadians(a);
        return Math.tan(a);
    }
}
