public class Functions {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(plus(5, i));
            System.out.println(i);
            if (isOdd(i)) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }

    }

    static void printHelloWorldAndOne() { //shift + F6 - rename
        System.out.println("Hello world");
        System.out.println(1);
    }
    static boolean isOdd(int x) {
        boolean result = ((x%2) != 0);
        return result;
    }

    static int plus(int a, int b) {
//        int result = a + b;
        return a + b;
//        return true;
    }

//    static int plus(int a, int b, int c) {
//        int result = a + b + c;
//        return result;
//    }

}


