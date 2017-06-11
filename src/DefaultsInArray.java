public class DefaultsInArray {

    //camelCaseNaming - именя переменных должны начинаться с маленькой буквы
    public static void main(String[] args) {
        int[] someArray = new int[5];
        someArray[3] = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " -> " + someArray[i]);
        }
        //default value for int -> 0

        boolean[] array = new boolean[3]; //sift + F6
        array[2] = true;
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " -> " + array[i]);
        }
        //default value for boolean -> false
    }

}
