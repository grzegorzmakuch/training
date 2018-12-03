package Sda;

public class IntList {
    private int[] elements;
    public IntList() {
        elements = new int[0];
    }

    public void add(int element) {
        int[] newElements = new int[elements.length + 1];
        for(int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        elements = newElements;
    }

    public int get(int index) {
        return elements[index];
    }

    public void removeAt(int index) {
        int[] newElements = new int[elements.length - 1];
        for(int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }
        for(int i = index + 1; i < elements.length; i++) {
            newElements[i - 1] = elements[i];
        }
        elements = newElements;
    }

    public void removeAll(int element) {
        int counter = 0;
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == element) {
                counter++;
            }
        }
        int newElementsLength = elements.length - counter;
        int newElements[] = new int[newElementsLength];
        int wskaznik = 0;

        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == element) {
                wskaznik++;
            } else {
                newElements[i - wskaznik] = elements[i];
            }
        }
        elements = newElements;
    }

    @Override
    public String toString() {
        String stringRepresentation = "Elementy tablicy:";
        for(int e: elements) {
            stringRepresentation += "\n" + e;
        }
        return stringRepresentation;
    }
}
