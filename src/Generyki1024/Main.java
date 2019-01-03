package Generyki1024;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Strawberry strawberry = new Strawberry();

        FruitContainer fruitContainer = new FruitContainer(fruit);
        System.out.println("Fruit continer 1: " + ((Fruit) fruitContainer.getFruit()).getName());

        FruitContainer<Fruit> fruitContainer1 = new FruitContainer<>(fruit);
        System.out.println("Fruit container 2: " + fruitContainer1.getFruit().getName());

        FruitContainer<Apple> fruitContainer2 = new FruitContainer<>(apple);
        System.out.println("Fruit container 3: " + fruitContainer2.getFruit().getName());

        FruitContainer<Strawberry> fruitContainer3 = new FruitContainer<>(strawberry);
        System.out.println("Fruit container 4: " + fruitContainer3.getFruit().getName());
    }
}
