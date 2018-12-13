package Strefa.Watki;

import java.util.stream.IntStream;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        IntStream.rangeClosed(1, 20).forEach(i -> System.out.println(i + " | Wykonywany watek : " + Thread.currentThread().getName()));
    }
}
