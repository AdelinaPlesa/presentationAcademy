package oop.abstraction;

public class MainAbstraction {

    public static void azorel() {
        Dog azorel = new Dog("Azorel", 3);
        azorel.fly();
    }

    public static void dumbo() {
        Elephant dumbo = new Elephant("Dumbo");
        dumbo.animalEats();
    }

    public static void kitty(){
        Cat kitty = new Cat();
        kitty.fly();
        kitty.animalEats();
    }

    public static void main(String args[]) {
        //abstract class example
        azorel();

        //interface example
        dumbo();

        //abstract class and interface example
        kitty();
    }
}
