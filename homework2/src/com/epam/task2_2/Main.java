package com.epam.task2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number --> ");
        int number = sc.nextInt();
        switch (number) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
            default: System.out.println("You didn't enter number from 1 to 9. Try again");
        }
    }

}
