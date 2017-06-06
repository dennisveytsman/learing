public class Homework1a {


    public static void main(String[] args) {
        int i,j,sum;
        boolean b = true;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 5; j++) {
                sum = i + j;
                b = ((sum % 2) != 0);
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                if (b) {
                    System.out.println("sum = " + sum + " - odd");
                } else {
                    System.out.println("sum = " + sum + " - even");
                    }
            }
        }
    }
}
    // i = 0 .. 10     j = 0 .. 5
    // sum = i + j
    //even = 2, 4, 6 -? even?
    //int modulus = 13 % 2; //1 - остаток
       // modulus = 10 % 2; //0
//number is even if modulus == 0


//output:
//i = 0  j = 0  sum = 0 - even
//i = 0  j = 1  sum = 1 - odd
//..
//i = 10  j = 5  sum = 15 - odd
