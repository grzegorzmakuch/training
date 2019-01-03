package Wzorce1024;

public class Main {
    public static void main(String[] args) {
        NumberService numberService1 = NumberService.getInstance();
        NumberService numberService2 = NumberService.getInstance();
        System.out.println(numberService1.equals(numberService2));
    }
}
