package main;

public class Homework2a {
    //таблица умножения
    //  1 2 3 4 5 .. N
    //1 1 2 3 ..
    //2 2 4 6 ..
    //3 .....
    //..
    //M
    static void printTable(int n, int m) {
        //печатать строки: 1 * 1 = 1
        //1 * 2 = 2
        //...
        //2 * 1 = 2
        //2 * 2 = 4
        //...
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int mul = i * j;
                System.out.println("i = " + i + ", j = " + j + ", mul = " + mul);
            }
        }
    }

    static int multiply(int a, int b) {
        System.out.println(a * b);
        return a * b; //fixme - написал чтобы программа компилировалась

    }

    public static void main(String[] args) {
        printTable(9, 9);


    }
}





