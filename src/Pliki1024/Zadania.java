package Pliki1024;

import java.io.*;
import java.util.Scanner;

public class Zadania {

    public static void wczytajLiczby() throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile liczb w tablicy: ");
        final int arraySize = sc.nextInt();

        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Podaj liczbe " + (i + 1));
            numbers[i] = sc.nextInt();
        }

        PrintWriter printWriter = new PrintWriter("wczytane.txt");
        for (int n : numbers) {
            printWriter.write(n + "\n");
        }
        printWriter.close();
    }

    public static void wczytajTekst() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile chcesz slow: ");
        final int arraySize = sc.nextInt();

        String[] words = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Podaj " + (i + 1) + " slowo");
            words[i] = sc.next();
        }

        PrintWriter printWriter = new PrintWriter("wczytanyTekst.txt");
        for(String s : words) {
            printWriter.write("Podano imie: " + s + "\n");
        }
        printWriter.close();
    }

    public static void stworzTablice() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku, ktory chcesz wczytac...");
        String fileName = sc.next();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        final int arraySize = Integer.parseInt(reader.readLine());
        int[] numbers = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            numbers[i] += i;
        }
        reader.close();

        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }

        System.out.println("Suma liczb z pliku wynosi: " + sum);
    }

}
