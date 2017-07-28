package classes;

public class Pupil {

    int age;
    String name;
    School school;
    Pupil bestFriend;

    //alt + insert -> toString()
    public String toString() {
        return "My name is " + name + " and I'm " + age + " old";
    }

    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "Alex";
        pupil.age = 26;

        System.out.println(pupil.name);
        System.out.println(pupil.age);
        System.out.println(pupil);
    }


}
