package oop.inheritance;

public class MainInheritance {
    public static void main (String []args){
        Flower rose = new Flower("Red", "Green", 4);

        rose.grow();
        rose.printFlower();

        Plant plant = new Cucumber(true, "Yellow", 10);
        plant.grow();

        Cucumber cucumber = new Cucumber(false, "Grey", 2);
        cucumber.printCucumber();
    }
}
