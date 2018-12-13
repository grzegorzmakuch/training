package Strefa.Watki;

public class Main {
    public static void main(String[] args) {
        System.out.println("Glowny watek aplikacji : " + Thread.currentThread().getName());
        Thread thread = new MyThread("MyThread - 1");
        Thread secondThread = new MyThread("MyThread - 2");
        Thread thirdThread = new MyThread("MyThread - 3");

        thread.start();
        secondThread.start();
        thirdThread.start();
    }
}
