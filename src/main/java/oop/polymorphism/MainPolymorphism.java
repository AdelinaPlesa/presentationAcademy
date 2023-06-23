package oop.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalSound();

        Animal dog = new Dog();
        dog.animalSound();
    }
}
