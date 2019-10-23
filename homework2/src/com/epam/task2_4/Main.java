package com.epam.task2_4;

public class Main {
    public static void main(String[] args){
        System.out.println(" * |  1  2  3  4  5  6  7  8  9");
        System.out.println("---------------------------------");
        int line = 1;
        while (line < 10) {
            int digit = 1;
            System.out.print(line + " | ");
            while (digit < 10) {
                System.out.printf("%3d",line*digit);
                digit++;
            }
            System.out.println();
            line++;
        }
    }
}
