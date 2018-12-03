package Sda;

public class Bicycle extends Vehicle {
    private int gears;
    private int wheels;

    public Bicycle(int speed, int gears,int wheels) {
        super(speed);
        this.gears = gears;
        this.wheels = wheels;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void repair() {
        System.out.println("Naprawiam rower");
    }


}
