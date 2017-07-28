package classes;

public class CatMain {

    public static void main(String[] args) {
        Cat alice = new Cat("Alice", 3);
        alice.setAge(5);
        alice.setAge(4);
        //alice.name = "Anna"; //can't do this - final
        System.out.println(alice.name);
//        System.out.println(alice.age); //age is private
        System.out.println(alice.getAge()); //getAge() is public
        alice.isMale = false;


        Cat bob = new Cat("Bob");
        bob.isMale = true;


        alice.play();
        bob.play();

        alice.eat("mice");
        bob.eat("vegetables");
    }

}
