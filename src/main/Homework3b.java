package main;

public class Homework3b {

    public static void main(String[] args) {

        int sum = 0;
        for (String arg : args) { //foreach
            System.out.println(arg);
            int element = Integer.valueOf(arg); //"1" -> 1
            sum += element;
        }
        System.out.println(sum);
        //google: java how to make string value integer ?

        //user passes some integer values to program arguments
        //need print these integers and its' sum

        //example:
        //1
        //2
        //3
        //sum = 6, not "123"

        //help:
//        int integer = Integer.valueOf("6"); // 6 - as a number
//        System.out.println("1" + "4" + "5");  //145
//        System.out.println(1 + 4 + 5); //10
    }

}
