package pl.mqhstudio;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 5, 8, 13, 21, 34};
        int[] intArraySecond = {3, 14, 15, 9, 24, 100};
        int[] intArrayThird = {1, 3, 1, 1, 3, 3, 4, 54, 1, 3, 3, 54};
        int[] intArrayForth = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 55544, 1};
        char[] textFirst = {'k', 'a', 'j', 'a', 'k'};
        char[] textSecond = {'a', 'b', 'c'};

//        ArrayUtils.print(intArray);
//        System.out.println(ArrayUtils.getMax(intArray));
//        System.out.println(ArrayUtils.getMin(intArray));
//        System.out.println(ArrayUtils.getSum(intArray));
//        ArrayUtils.print(ArrayUtils.getMaxMinAndSum(intArray));
//        ArrayUtils.print(ArrayUtils.getLarger(intArray, intArraySecond));
//        ArrayUtils.print(ArrayUtils.merge(intArray, intArraySecond));
//        ArrayUtils.print(ArrayUtils.getDistinct(intArrayForth));
//        System.out.println(StringUtils.isPalindrome(textFirst));
//        System.out.println(StringUtils.isPalindrome(textSecond));
//        System.out.println(StringUtils.reverse(textSecond));
        System.out.println(StringUtils.differentCharCount(textFirst));
    }
}
