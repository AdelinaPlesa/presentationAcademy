package staticExample;

public class Main {
    public static void main(String[] args) {
        StaticClass.staticVariable = "example";

        System.out.println(StaticClass.staticVariable);

        System.out.println("Sum result: " + StaticClass.sum(32, 76));
    }
}
