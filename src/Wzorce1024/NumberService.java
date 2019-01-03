package Wzorce1024;

import java.util.ArrayList;
import java.util.List;

public class NumberService {
    List<Integer> numbers = new ArrayList<>();

    private static NumberService instance = null;

    public static NumberService getInstance() {
        if(instance == null) {
            instance = new NumberService();
        }
        return instance;
    }

    private NumberService() { }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
