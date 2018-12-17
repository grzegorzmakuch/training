package BeSapiens;

public class Main {
    public static void main(String[] args) {
        //1
        int x = 3, y = 5, z = 8;
        int greater = x>y ? (x>z ? x:z) : (y>z ? y:z);
        System.out.println(greater);

        //2
        for(int i = 5; i < 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //3
        int a = 13;
        for(int i = 0; i < a; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //4
        int b = 16, c = 34;
        for(int i = 1; i < c; i++) {
            if(b * i < c) {
                System.out.print(b * i + " ");
            } else {
                break;
            }
        }
        System.out.println();
    }
}
