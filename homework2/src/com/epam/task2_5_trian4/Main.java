package com.epam.task2_5_trian4;

public class Main {
    public static void main(String[] args) {
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
            System.out.println();
            line++;
        }
        line = max;
        while (line > 1) {
            stolb = line - 1;
            i = max - stolb;
            while (i > 0) {
                System.out.print("   ");
                i--;
            }
            while (stolb > 0) {
                System.out.print(" * ");
                stolb--;
            }
            System.out.println();
            line--;
        }
    }

}


