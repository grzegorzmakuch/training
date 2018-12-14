package Todolist;

public class NumberService {

    int [] numbers = {10, 2, 3, 85, 23, 491, 23, 412, 42, 41, 22, 25};

    public int getCountNumbers() {
        int counter = 0;
        for(int n : numbers) {
            counter++;
        }
        return counter;
    }

    public int countNumbersHigherThan(int number) {
        int counter = 0;
        for(int n : numbers) {
            if(n > number) {
                counter++;
            }
        }
        return counter;
    }

    public int countNumbersLowerThan(int number) {
        int counter = 0;
        for(int n : numbers) {
            if(n < number) {
                counter++;
            }
        }
        return counter;
    }

    public int sumNumbers() {
        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public void displayNumbers() {
        for(int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    //todo: dopisac sortownaie babelkowe
}
