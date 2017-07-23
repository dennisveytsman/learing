package classes;

public class Dog {

    String name;

    void woof() {
        System.out.println(name + ": Woooof!!!");
    }

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.woof();

        Dog anotherDog = new Dog();
        anotherDog.name = "Sharik";
        anotherDog.woof();

        say("Hello!");
    }

    static void say(String whatToSay) {
        System.out.println("I say: " + whatToSay);
    }

}
