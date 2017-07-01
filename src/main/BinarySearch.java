public class BinarySearch {
     //                                           |
    //96 145 149 191 223 333 385 387 421 519 574 595 598 785 802 858


    // x  x   x   x   x   x   x   x   x   x   x   x   x   x   x   x
    // x  x   x   x   x   x   x  387  x   x   x   x  598  x   x   x
    // x  x   x   x   x   x   x  387  x   x  574  x  598  x   x   x
    // x  x   x   x   x   x   x  387  x   x  574 595 598  x   x   x

    //2 ^ ? = 16    ? = 4
    //2 ^ ? = 100   ? = ~7

    //2  3  5  7  11  13  17  19  23  29  31  37  41  43  47  53  59  61  67  71  73  79  83  89  97
    //find 5
    //x  x  x  x  x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x
    //x  x  x  x  x   x   x   x   x   x   x   x   x   43  x   x   x   x   x   x   x   x   x   x   x
    //x  x  x  x  x   x   17  x   x   x   x   x   x   43  x   x   x   x   x   x   x   x   x   x   x
    //x  x  x  7  x   x   17  x   x   x   x   x   x   43  x   x   x   x   x   x   x   x   x   x   x
    //x  3  x  7  x   x   17  x   x   x   x   x   x   43  x   x   x   x   x   x   x   x   x   x   x
    //x  3  x  7  x   x   17  x   x   x   x   x   x   43  x   x   x   x   x   x   x   x   x   x   x
    //x  3  5  7  x   x   17  x   x   x   x   x   x   43  x   x   x   x   x   x   x   x   x   x   x

    public static void main(String[] args) {
        int[] arr = new int[] {2,  3,  5,  7,  11,  13,  17,  19,  23};
        int lookFor = 7;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (true) {
            int midIndex = (leftIndex + rightIndex) / 2; //left = 0, right = 3, mid = (0 + 3) / 2 = 1, not 1.5
            int element = arr[midIndex];
            System.out.println("Opened "+ element + " on index " + midIndex);
            if (element == lookFor) {
                System.out.println("Found " + lookFor + " on index " + midIndex);
                return;
            }
            if (element > lookFor) {
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }
    }

}
