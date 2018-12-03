package Strefa;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double waga;
        double wzrost;
        double bmi;

        System.out.println("Podaj swoja wage:");
        waga = sc.nextDouble();

        System.out.println("Podaj wzrost w cm:");
        wzrost = sc.nextDouble();

        bmi = waga / Math.pow((wzrost / 100), 2);
        System.out.printf("Twoje bmi wynosi %.2f\n\n", bmi);
    }
}
