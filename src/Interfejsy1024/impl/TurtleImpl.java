package Interfejsy1024.impl;

import Interfejsy1024.api.Turtle;

public class TurtleImpl implements Turtle {
    @Override
    public void hideInShell() {
        System.out.println("Zolw chowa sie w skorupie");
    }

    @Override
    public void layEggs() {
        System.out.println("Zolw sklada jaja");
    }

    @Override
    public void move() {
        System.out.println("Zolw sie porusza");
    }

    @Override
    public void eat() {
        System.out.println("Zolw je");
    }
}
