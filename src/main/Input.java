package main;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("program summing a and b");
        System.out.println("please enter a");
        int a = scanner.nextInt();
        System.out.println("please enter b");
        int b = scanner.nextInt();
        System.out.println(a + b);


    }

}
