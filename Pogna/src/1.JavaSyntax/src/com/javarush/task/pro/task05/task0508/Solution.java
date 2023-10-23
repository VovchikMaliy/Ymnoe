package com.javarush.task.pro.task05.task0508;

import java.util.Objects;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0, k = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (j != i && strings[i] != null) {
                    if (strings[i].equals(strings[j])) {
                        strings[j] = null;
                        k++;
                    }
                }
            }
            if (k > 0) strings[i]  = null;
            k = 0;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}


