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
}
