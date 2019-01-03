package Interfejsy1024;

import Interfejsy1024.api.*;
import Interfejsy1024.impl.DogImpl;
import Interfejsy1024.impl.TurtleImpl;

public class Main {
    public static void main(String[] args) {
        Animal turtle = new TurtleImpl();
        Reptiles secondTurtle = new TurtleImpl();
        Turtle thirdTurtle = new TurtleImpl();

        Animal dog = new DogImpl();
        Mammal secondDog = new DogImpl();
        Dog thirdDog = new DogImpl();

        turtle.eat();
        secondTurtle.layEggs();
        thirdTurtle.hideInShell();


        dog.move();
        secondDog.feedChildWithMilk();
        thirdDog.bark();
    }
}
