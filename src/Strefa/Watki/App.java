package Strefa.Watki;

public class App {
    public static void main(String[] args) {
//        Thread newThread = new MyThread();
//        newThread.start();
        double num1 = 12.1234;
        double num2 = 12.123;

        System.out.println(isTrue(num1, num2));
        System.out.println(getDurationString(120));

//        System.out.println("num1 (double) : " + num1);
//        double newNum = num1 * 1000;
//        System.out.println("newNum (double) : " + newNum);
//        int newInt = (int) newNum;
//        System.out.println("newInt (int) : " + newInt);
//        int superInt = (int) (num1 * 1000);
//        System.out.println("superInt (int) : " + superInt);
    }

    public static boolean isTrue(double x, double y) {
        return (int)(x*1000) == (int)(y*1000);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a > 13 || b >13 || c > 13) && (a <=19 || b <=19 || c<=19);
    }

    private static String getDurationString(int minutes, int seconds) {
        String result = "";
        int secs = seconds % 60;
        int mins = minutes + (seconds / 60);
        int hours = seconds / 3600;

        if(minutes <= 0) {
            result += "Invalid value";
        } else {
            //result += "hours: " + hours + "; minutes: " + mins + "; seconds: " + secs;
            result += " minutes: " + mins + "; seconds: " + secs;
        }
        return result;
    }

    private static String getDurationString(int seconds) {
        String result = "";
        if(seconds < 0) {
            result += "Invalid value";
        } else {
            result += "Minutes = " + seconds / 60 + "; seconds = " + seconds % 60;
        }

        return result;
    }
}
