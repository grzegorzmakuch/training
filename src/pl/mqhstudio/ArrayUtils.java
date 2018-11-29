package pl.mqhstudio;

public class ArrayUtils {

    public static void print(int[] tab) {
        for(int elem:tab) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static int getMax(int[] tab) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int getMin(int[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int getSum(int[] tab) {
        int sum = 0;
        for(int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }

    public static int[] getMaxMinAndSum(int[] tab) {
        int[] result = {
                getMax(tab),
                getMin(tab),
                getSum(tab)
        };
        return result;
    }

    public static int[] getLarger(int[] tabFirst, int[] tabSecond) {
        if(getSum(tabFirst) > getSum(tabSecond)) {
            return tabFirst;
        } else {
            return tabSecond;
        }
    }

    public static int[] merge(int[] tabFirst, int[] tabSecond) {
        int[] mergedTab = new int[tabFirst.length + tabSecond.length];
        for(int i = 0; i < tabFirst.length; i++) {
            mergedTab[i] = tabFirst[i];
        }
        for(int i = 0; i < tabSecond.length; i++) {
            mergedTab[tabFirst.length + i] = tabSecond[i];
        }
        return mergedTab;
    }
}
