package classes;

public class Safe {

    private int password; //private = this variable in not visible from other classes
    //public - visible from any class
    //protected, _ - out of scope

    //constructor
    Safe(int safePassword) {
        password = safePassword;
    }

    boolean check(int inputPassword) {
        return password == inputPassword;
    }

    void changePassword(int currentPassword, int newPassword) {
        if (password == currentPassword){
            password = newPassword;
            System.out.println("Password was changed");
        } else {
            System.out.println("Wrong password");
        }
    }


}
