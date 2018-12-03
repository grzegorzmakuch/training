package Strefa;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random randomGenerator = new Random();

        for(int i = 0; i < 100; i++) {
            arrayList.add(randomGenerator.nextInt());
        }

        long start = System.currentTimeMillis();
        int result = 0;
        for(int i: arrayList) {
            result += isPrime(i);
        }
        long stop = System.currentTimeMillis() - start;
        System.out.println("From 100 numbers " + result + " are prime.");
        System.out.println("Execution time in ms: " + stop);

        System.out.println("=======================");
        start = System.currentTimeMillis();
        result = arrayList.stream().map(Main::isPrime).reduce(Integer::sum).get();
        stop = System.currentTimeMillis() - start;
        System.out.println("From 100 numbers " + result + " are prime.");
        System.out.println("Execution time in ms: " + stop);


        System.out.println("=======================");
        start = System.currentTimeMillis();
        result = arrayList.parallelStream().map(Main::isPrime).reduce(Integer::sum).get();
        stop = System.currentTimeMillis() - start;
        System.out.println("From 100 numbers " + result + " are prime.");
        System.out.println("Execution time in ms: " + stop);

    }

    public static int isPrime(int n) {
        n = Math.abs(n);
        for(int i = 2; i < n; i++) if(n % i == 0) return 0;
        return 1;
    }
}