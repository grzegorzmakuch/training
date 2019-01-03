package Porownania1024;

public class Main {
    public static void main(String[] args) {
        String mqh = "makosky";
        String drugiMqh = new String("makosky");
        String trzeciMqh = "makosky";
        String czwartyMqh = new String("makosky");

        if(mqh == trzeciMqh) {
            System.out.println("mqh rowna sie trzeciMqh");
        } else {
            System.out.println("mqh nie rowna sie trzeciMqh");
        }

        if(mqh == drugiMqh) {
            System.out.println("mqh rowna sie drugiMqh");
        } else {
            System.out.println("mqh nie rowna sie drugiMqh");
        }

        if(mqh.equals(drugiMqh)) {
            System.out.println("mqh equals drugiMqh");
        } else {
            System.out.println("mqh nie equals drugiMqh");
        }

        if(drugiMqh == czwartyMqh) {
            System.out.println("drugiMqh rowna sie czwartyMqh");
        } else {
            System.out.println("drugiMqh nie rowna sie czwartyMqh");
        }
    }
}
