public class Homework2b {

    public static void main(String[] args) {
        boolean[] oddOrEvenArray = new boolean[10];

        // заполнить массив true если индекс - четное число, false если нечетное

        for (int i = 0; i < oddOrEvenArray.length; i++) {
            oddOrEvenArray[i] = isOdd(i);
        }

        for (int i = 0; i < oddOrEvenArray.length; i++) {
            System.out.println(i + " -> " + oddOrEvenArray[i]);
        }
        //...
        //нужно:
        //0 -> true
        //1 -> false
        //...

    }

    static boolean isOdd(int x) {
        boolean result = ((x%2) != 1);
        return result;
    }


}
