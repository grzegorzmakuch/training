package Todolist;

public class Main {
    public static void main(String[] args) {

//        UserService userService = new UserService();
//        User user1 = userService.getUserByLogin("admin");
//        System.out.println("Znaleziono usera: " + user1.login + " " + user1.email);
//        int sumAge = userService.getUserAge();
//        System.out.println("Wiek wszystkich userow : " + sumAge);
        NumberService numberService = new NumberService();

        int numberServiceCountNumbers = numberService.getCountNumbers();
        System.out.println("Liczba wszystkich liczb w numberService : " + numberServiceCountNumbers);

        int numbersHigherThan = numberService.countNumbersHigherThan(5);
        System.out.println("Ilosc liczb wiekszych od 5 : " + numbersHigherThan);

        int numbersLowerThan = numberService.countNumbersLowerThan(5);
        System.out.println("Ilosc liczb mniejszych od 5 : " + numbersLowerThan);

        int sumNumbers = numberService.sumNumbers();
        System.out.println("Suma wszystkich liczb w tablicy : " + sumNumbers);

        numberService.displayNumbers();
    }
}