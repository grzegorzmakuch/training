package Strefa;

import java.io.*;
import java.util.Scanner;

public class Pliki {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Strefa/plik.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        try {
            bufferedWriter.write("To jest przykladowe zapisywanie danych do pliku");
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println("WYstapil blad IOException");
        }

        FileWriter fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);

        try {
            bufferedWriter.write("\nTo jest nowy tekst");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("WYstapil blad IOException");
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();
            System.out.println(line);
        } catch(IOException e) {
            System.out.println("WYstapil blad IOException");
        }

        Scanner sc = new Scanner(file);
        String s = sc.nextLine();
    }
}
