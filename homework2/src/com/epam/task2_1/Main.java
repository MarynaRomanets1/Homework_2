package com.epam.task2_1;

public class Main {

    public static void main(String[] args) {
        int a = 4, b = -5, c = 9;
        int maxValue = a;
        if (b > maxValue) {
            maxValue = b;
        }
        if (c > maxValue) {
            maxValue = c;
        }
        System.out.println("max value = " + maxValue);
    }
}
