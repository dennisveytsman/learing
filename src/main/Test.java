package main;

public class Test {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        a = 6;

        double d = 3.5; //3.5 * 6 = 18 + 3 = 21   /   21.0
        System.out.println(a * d);

        boolean bool = false;
        bool = true;

        System.out.println(bool);


        a = 11;
        if (a > 10) {
            System.out.println("Greater than 10");
        } else { // a <= 10
            System.out.println("Less or equal 10");
        }

        b = 3;
        if (a > 5 && b < 10) {
            System.out.println("variant 1");
        }

        d = 25.0;
        int comparingWith = 26;
        if (d > comparingWith) {
            System.out.println("Greater than " + comparingWith);
        } else {
            System.out.println("Less than " + comparingWith);
        }

    }



}
