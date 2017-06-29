package main;

public class Arrays {

    public static void main(String[] args) {
        int[] myArray = new int[] {5, 1, 4, 8, 4};
        for (int element : myArray) { //"for each element in array"
            System.out.println(element);
        }
    }

    public static void main1(String[] args) {
        //5 1 4 8 4
        //sort:
        //1 4 4 5 8  (4 > 1, 5 > 4, 8 > 5)
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 4;
        myArray[3] = 8;
        myArray[4] = 4;

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " -> " + myArray[i]);
        }

    }

}
