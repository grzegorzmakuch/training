package pl.mqhstudio;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 5, 8, 13, 21, 34};
        int[] intArraySecond = {3, 14, 15, 9, 24, 100};
        ArrayUtils.print(intArray);
        System.out.println(ArrayUtils.getMax(intArray));
        System.out.println(ArrayUtils.getMin(intArray));
        System.out.println(ArrayUtils.getSum(intArray));
        ArrayUtils.print(ArrayUtils.getMaxMinAndSum(intArray));
        ArrayUtils.print(ArrayUtils.getLarger(intArray, intArraySecond));
        ArrayUtils.print(ArrayUtils.merge(intArray, intArraySecond));
    }
}
