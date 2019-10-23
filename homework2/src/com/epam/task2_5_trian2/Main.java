package com.epam.task2_5_trian2;

public class Main {
    public static void main(String[] args){

        int max = 6;
        int line = max;
        int i;
        while (line > 0) {
            int stolb = line;
            i = max - line;
            while (i > 0){
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
