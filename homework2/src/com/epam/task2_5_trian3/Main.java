package com.epam.task2_5_trian3;

public class Main {
    public static void main(String[] args) {
        int max = 6;
        int i;
        int line = 1;
        while (line <= max){
            i = max - line;
            while (i > 0) {
                System.out.print("   ");
                i--;
            }
            int stolb = line;
            while (stolb > 0) {
                System.out.print(" * ");
                stolb--;
            }
            System.out.println();
            line++;
        }

    }

}
