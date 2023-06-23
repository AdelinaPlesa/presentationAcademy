package oop.inheritance;

public class Cucumber extends Plant{
    boolean hasFruits;

    Cucumber(){
        this.hasFruits = false;
    }

    Cucumber(boolean hasFruitsParam, String colorParam, int sizeParam){
        super(colorParam, sizeParam);
        this.hasFruits = hasFruitsParam;
    }

    public void printCucumber(){
        System.out.println("Has fruits:" + this.hasFruits);
        System.out.println("Plant color:" + this.color);
        System.out.println("Size:" + this.size);
    }
}
