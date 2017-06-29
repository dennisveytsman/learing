package main;

import java.util.Scanner;

public class Input2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Please enter a positive numbers to sum");
            System.out.println("Or enter 0 to see sum");
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
