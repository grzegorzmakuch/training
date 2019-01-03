package Interfejsy1024.impl;

import Interfejsy1024.api.Dog;

public class DogImpl implements Dog {
    @Override
    public void bark() {
        System.out.println("Pies szczeka");
    }

    @Override
    public void feedChildWithMilk() {
        System.out.println("Pies karmi potomstwo mlekiem");
    }

    @Override
    public void move() {
        System.out.println("Pies biegnie");
    }

    @Override
    public void eat() {
        System.out.println("Pies je");
    }
}
