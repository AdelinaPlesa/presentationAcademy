package oop.inheritance;

public class Plant {
    String color;

    int size;

    Plant(){
        this.color = "";
        this.size = 0;
    }

    Plant(String colorParam, int sizeParam){
        this.color = colorParam;
        this.size = sizeParam;
    }

    public void grow(){
        System.out.println("The " + this.color + " plant will grow...");
    }
}
