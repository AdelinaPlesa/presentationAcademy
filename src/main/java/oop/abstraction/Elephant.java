package oop.abstraction;

public class Elephant implements IAnimal {

    String name;

    Elephant(String name) {
        this.name = name;
    }

    @Override
    public void animalEats() {
        System.out.println("The elephant eats grass.");
    }
}
