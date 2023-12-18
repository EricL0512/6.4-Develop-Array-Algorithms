import java.util.Arrays;

public class Algorithms {
    public void printArray(int[] ints) {
        for (int i: ints) System.out.print(i);
        System.out.printf("\n");
    }
    public int[] swapArrayIndex(int[] ints, int a, int b) {
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
        return ints;
    }
    public int returnMax(int[] ints) {
        int max = Integer.MIN_VALUE;
        for (int i : ints) {
            if (i > max) max = i;
        }
        return max;
    }
    public int returnMin(int[] ints) {
        int max = Integer.MAX_VALUE;
        for (int i : ints) {
            if (i < max) max = i;
        }
        return max;
    }
    public String returnMaxString(String[] strings) {
        String max = "";
        for (String str : strings) {
            if (str.length() > max.length()) max = str;
        }
        return max;
    }
    public String returnMinString(String[] strings) {
        String min = strings[0];
        for (String str : strings) {
            if (str.length() < min.length()) min = str;
        }
        return min;
    }
    public int largestArrayDifference(int[] a, int[] b) {
        int maximum = Integer.MIN_VALUE;
        for (int i : a) {
            for (int j : b) {
                if (Math.abs(i-j) > maximum) maximum = Math.abs(i-j);
            }
        }
        return maximum;
    }
    public double meanArray(double[] a) {
        double result = 0;
        for (double i : a) {
            result += i;
        }
        return result/(a.length);
    }
    public int[] reverseOrder(int[] a) {
        int temp;
        for (int i = 0; i < (a.length/2); i++) {
            temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        return a;
    }
    public boolean consecutiveValues(int[] a) {
        for(int i = 0;i < a.length-1; i++) {
            if (a[i] == a[i+1]) return true;
        }
        return false;
    }
    public int firstNegative(int[] a) {

    }
}
