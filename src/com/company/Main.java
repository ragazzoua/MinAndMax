package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 2147483647; //Integer.MAX_VALUE
        int max = -2147483648; //Integer.MIN_VALUE
//        boolean first = true;

        while (true) {
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min " + min + ", max " + max);
        scanner.close();
    }
}
