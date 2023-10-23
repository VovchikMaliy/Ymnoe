package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < result.length) {
            result[i] = new int[i + 1];
            j = 0;
            while (j <= i) {
                result[i][j] = i + j;
                System.out.printf("%s\t", result[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
