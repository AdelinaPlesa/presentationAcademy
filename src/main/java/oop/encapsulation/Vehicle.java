package oop.encapsulation;

public class Vehicle {
    private String color;
    protected String model;
    public int numberOfSeats;
    boolean suv;

    public Vehicle(String color, String model, int numberOfSeats, boolean suv) {
        this.color = color;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.suv = suv;
    }

    private Vehicle(String color, int numberOfSeats) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    private void methodPrivate() {
        System.out.println("This method is private");
    }
    protected void methodProtected() {
        System.out.println("This method is protected");
    }
    public void methodPublic() {
        System.out.println("This method is public");
    }
    void methodDefault() {
        System.out.println("This method is default");
    }
}
