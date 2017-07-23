package classes;

public class SafeCheck {

    public static void main(String[] args) {
        Safe safe = new Safe(1234);
        System.out.println(safe.check(2345));
        System.out.println(safe.check(1234));

        safe.changePassword(2345, 7777);
        safe.changePassword(1234, 8888);
//        System.out.println(safe.password); //not visible

    }

}
