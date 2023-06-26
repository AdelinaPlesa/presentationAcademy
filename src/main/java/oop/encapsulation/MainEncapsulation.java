package oop.encapsulation;

public class MainEncapsulation {
    public static void main (String []args){
        //private constructor
//        Vehicle bike = new Vehicle("Red", 4);

        Vehicle car = new Vehicle("Blue", "Golf", 3, false);
        //public
        car.numberOfSeats = 7;
        //protected
        car.model = "Polo";
        //default
        car.suv = true;
        //private
//        car.color = "Green";

        System.out.println("Number of seats: " + car.numberOfSeats);
        System.out.println("Model: " + car.model);
        System.out.println("Is suv: " + car.suv);
    }
}
