package Sda;

public class Boat extends Vehicle {
    private int body;
    private int mast;

    public Boat(int speed, int body, int mast) {
        super(body);
        this.body = body;
        this.mast = mast;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getMast() {
        return mast;
    }

    public void setMast(int mast) {
        this.mast = mast;
    }

    @Override
    public void repair() {
        System.out.println("Naprawiam lodke");
    }
}
