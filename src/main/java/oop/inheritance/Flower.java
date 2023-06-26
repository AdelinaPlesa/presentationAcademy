package oop.inheritance;

import jdk.jfr.FlightRecorder;

import java.util.concurrent.Flow;

public class Flower extends Plant{

    String petalColor;

    Flower(){
        super();
        this.petalColor = "";
    }

    Flower(String colorParam){
        super(colorParam);
    }

    Flower(String petalColorParam, String colorParam, int sizeParam){
        super(colorParam, sizeParam);
        this.petalColor = petalColorParam;
    }

    public void printFlower(){
        System.out.println("Leaf color: " + this.color);
        System.out.println("Petal color: " + this.petalColor);
        System.out.println("Size: " + this.size);
    }
}
