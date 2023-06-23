package oop.abstraction;

public class Dog extends Animal {

    String name;

    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void fly() {
        System.out.println("Dogs can't fly.");
    }
}
