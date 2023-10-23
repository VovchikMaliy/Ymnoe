package com.javarush.task.pro.task08.task0803;

import java.sql.Array;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                    currentMin = Math.min(ints[i], ints[j]);
                    if (min > currentMin){
                        min = currentMin;
                    }
            }
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
