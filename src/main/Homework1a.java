package main;

public class Homework1a {

    public static void main(String[] args) {
        boolean isOdd = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                int sum = i + j;
                isOdd = ((sum % 2) != 0);
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                if (isOdd) {
                    System.out.println("sum = " + sum + " - odd");
                } else {
                    System.out.println("sum = " + sum + " - even");
                }
            }
        }
    }
}
