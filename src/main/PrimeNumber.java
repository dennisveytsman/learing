public class PrimeNumber {

    //- 2 3 - 5 - 7 -

    //4 can be divided by 1, 2, 4 -> not prime
    //1 can be divided by 1 only

    //1 2 3 - 5 - 7 - - - 11 - 13 - - .. N
    //2 -> current
    //3 -> current
    //5 -> current
    // ..
    // current * current <= N
    //N = 10 000
    //2, 3, .. 100
    //100 * 100 <= 10 000

    //1 2 3 - 5 - 7 - - - 11 - 13 - - - 17 - 19 - - - 23 - - -

    public static void main(String[] args) {
        boolean[] crossed = generatePrime(100);
        for (int i = 2; i < crossed.length; i++) {
            if (!crossed[i]) {
                System.out.print(i +"  ");
            }
        }
    }

    public static boolean[] generatePrime(int n) {
        boolean[] crossed = new boolean[n + 1];

        for (int current = 2; current * current <= n; current++) {
            if (crossed[current]) {
                continue;
            }
            for (int i = current + 1; i <= n; i++) {
                if (i % current == 0) {
                    crossed[i] = true;
                }
            }
        }
        return crossed;
    }

}
