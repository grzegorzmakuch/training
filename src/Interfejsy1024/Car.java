package Interfejsy1024;

public class Car implements Vehicle {

    public Car() {}

    @Override
    public void drive() {
        System.out.println("Jade autem");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuje auto");
    }

}
