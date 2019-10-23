package com.epam.task2_5_trian5;

public class Main {
    public static void main(String[] args) {
        int j = 2;
        while (j > 0) {
            int max = 6;
            int i;
            int line = 1;
            int stolb;
            while (line <= max) {
                i = max - line;
                while (i > 0) {
                    System.out.print("   ");
                    i--;
                }
                stolb = line;
                while (stolb > 0) {
                    System.out.print(" * ");
                    stolb--;
                }
                stolb = line - 1;
                while (stolb > 0) {
                    System.out.print(" * ");
                    stolb--;
                }
                System.out.println();
                line++;
            }
        j--;
        }
    }
}
