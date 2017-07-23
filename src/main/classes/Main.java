package classes;

public class Main {

    public static void main(String[] args) {
        School lyceum1547 = new School();
        lyceum1547.name = "Lyceum №1547";
        lyceum1547.location = "Russia, Moscow";

        Pupil alex = new Pupil();
        alex.name = "Alexey";
        alex.age = 15;
        alex.school = lyceum1547;

        Pupil a = new Pupil();
        a.name = "B";
        a.school = lyceum1547;
        a.age = 167;

        //System.out.println(a.name + " attends " + a.school.name + " located in " + a.school.location);
        //System.out.println(alex.name + " attends " + alex.school.name + " located in " + alex.school.location);

        a.bestFriend = alex;
        System.out.println(a.name + "'s best friend name is " + a.bestFriend.name);


        Pupil pupil = new Pupil();
        System.out.println(pupil.name);
        System.out.println(pupil.age);
        //pupil.school = lyceum1547;
        pupil.bestFriend = a;
        if (pupil.school != null) {
            System.out.println(pupil.school.name);
        } else {
            System.out.println("School unknown");
        }
        if (pupil.bestFriend != null) {
            System.out.println(pupil.bestFriend.name);
        } else {
            System.out.println("Pupil has no best friend");
        }
    }

}
