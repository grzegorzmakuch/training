package Interfejsy1024;

public class Bike implements Vehicle {

    public Bike() {}

    @Override
    public void drive() {
        System.out.println("Jazda rowerem");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuje rower");
    }
}
