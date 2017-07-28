package classes;

public class Cat {
    private int age;
    boolean isMale;
    final String name; //final = variable can be assigned only once

    //create constructor that accepts name
    Cat (String catsName){
        name = catsName;
        age = 1;
    }

    //create another constructor that accepts name and age
    Cat (String catsName, int catsAge) {
        age = catsAge;
        name = catsName;
    }

    void play() {
        System.out.println(name + " is playing");
    }

    //create function that would print
    //<name> eats .. (parameter of function)
    void eat(String whatToEat) {
        System.out.println(name + " eats " + whatToEat);
    }

    void setAge(int newAge) {
        if (newAge >= age) {
            age = newAge;
            System.out.println("Age changed");
        } else {
            System.out.println("Can't set age");
        }
    }

    //alt + insert


    public int getAge() {
        return age;
    }
}
