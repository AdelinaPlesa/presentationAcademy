package oop.exampleEncapsulation;

import oop.encapsulation.Vehicle;

public class Main {
    public static void main(String args[]){
        Vehicle car = new Vehicle("Blue", "Golf", 3, false);

        //public
//        car.numberOfSeats = 2;
//        //protected
//        car.model = "Polo";
//        //default
//        car.suv = true;
//        //private
//        car.color = "Green";
        System.out.println("Number of seats: " + car.numberOfSeats);
    }
}
