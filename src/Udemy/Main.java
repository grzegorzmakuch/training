package Udemy;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    private static String getDurationString(int minutes, int seconds) {
        if((minutes < 0 || seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int minutesRemaining = minutes % 60;

        String hoursString = hours + "h :";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutesRemaining + "m :";
        if(minutesRemaining < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int secondsRemaining = seconds % 60;

        return getDurationString(minutes, secondsRemaining);
    }

    public static void MinutesToYearAndDay(long minutes) {
        if(minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long yearInMinutes = 60 * 24 * 365;
            long year = minutes / yearInMinutes;
            long remainingDays = year % yearInMinutes;
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }

    public static boolean isLeapYear(int year) {
        if(year < 0 || year > 9999) {
            return false;
        } else if(year % 4 != 0) {
            return false;
        } else if(year % 400 == 0) {
            return true;
        } else if(year % 100 == 0) {
            return false;
        }
        return true;
    }

    public static int getDaysInMonth(int month, int year) {
        if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        switch(month) {
            case 2:
                if(isLeapYear(year))
                    return 29;
                else
                    return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static void sumThreeAndFiveChallenge() {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i % 3 == 0 && i% 5 == 0) {
                sum += i;
                counter++;
                System.out.println("Found number = " + i);
            }
            if(counter == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
        if(number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if(start < 0 || end < 0 || end > start) {
            return -1;
        }
        int sum = 0;
        for(int i = start; i < end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int digitSumChallenge(int number) {
        if(number < 10) {
            return -1;
        }
        int sum = 0;
        if(number < 0) {
            return -1;
        } else {
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int copyNumber = number;
        int reverse = 0;
        int lastDigit = 0;
        while(number > 0) {
            reverse *= 10;
            lastDigit = number % 10;
            number /= 10;
            reverse += lastDigit;
        }
        return copyNumber == reverse;
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while(number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }
}
