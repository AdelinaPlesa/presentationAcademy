package oop.abstraction;

public class Cat extends Animal implements IAnimal{
    @Override
    void fly() {
        System.out.println("Cats don't fly.");
    }

    @Override
    public void animalEats() {
        System.out.println("Cats usually eats meat.");
    }
}
