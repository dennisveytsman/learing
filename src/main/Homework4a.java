// it still works at least?

package main;

import java.util.Scanner;

public class Homework4a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("This program counts average of 5 numbers you enter");
        System.out.println("please enter a");
        double a = scanner.nextDouble();
        System.out.println("please enter b");
        double b = scanner.nextDouble();
        System.out.println("please enter c");
        double c = scanner.nextDouble();
        System.out.println("please enter d");
        double d = scanner.nextDouble();
        System.out.println("please enter e");
        double e = scanner.nextDouble();
        double average = (a + b + c + d + e) / 5.0;
        System.out.println("average is...");
        System.out.println(average);
        //in loop: ask user to enter a number 5 times
        //example: 1 1 2 3 3
        //avg = 2
        //please divide by 5.0 not 5
    }
}
