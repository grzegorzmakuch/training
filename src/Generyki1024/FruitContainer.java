package Generyki1024;

public class FruitContainer<T> {
    private T fruit;

    public FruitContainer(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}
