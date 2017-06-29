package main;

public class Loop {

    public static void main(String[] args) {

//        System.out.println("Hello world"); //Ctrl + D
        System.out.println("before");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                int mult = i * j;
                if (mult > 10) {
                    System.out.println();
                    System.out.print(" i = " + i);
                    System.out.print("   j = " + j);
                    System.out.print("   i * j = " + mult);
                    System.out.println();
                } else {
                    System.out.println("Less than 10");
                }

            }
        }
        System.out.println("after");


    }
}