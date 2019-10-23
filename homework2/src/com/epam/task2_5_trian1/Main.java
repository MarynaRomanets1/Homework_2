package com.epam.task2_5_trian1;

public class Main {
    public static void main(String[] args) {
        int line = 1;
        int max = 6;
        while (line <= max) {
            int stolb = line;
            while (stolb > 0) {
                System.out.print(" * ");
                stolb--;
            }
            System.out.println();
            line++;
        }
        line = 1;
        while (line <= (max - 1)) {
            int stolb = line;
            while (stolb <= (max - 1)) {
                System.out.print(" * ");
                stolb++;
            }
            System.out.println();
            line++;
        }
    }
}
