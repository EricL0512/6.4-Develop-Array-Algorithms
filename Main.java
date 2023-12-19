public class Main {
    public static void printList(int[] i) {
        for(int j : i) System.out.print(j + " ");
        System.out.println();
    }
    public static void printList(String[] s) {
        for(String str : s) System.out.print(str + " ");
        System.out.println();;
    }
    public static void main(String[] args) {
        Algorithms a = new Algorithms();
        System.out.println("print Array:\n");
        a.printArray(new int[]{1, 2, 3});
        a.printArray(new int[]{1, 2, 7, 3});
        a.printArray(new int[]{1, 7, 8});
        System.out.println("\nSwap Array Index:\n");
        printList(a.swapArrayIndex(new int[]{1, 2, 3, 4}, 1, 2));
        printList(a.swapArrayIndex(new int[]{1, 2, 7, 3}, 0, 3));
        printList(a.swapArrayIndex(new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3}, 0, 2));
        System.out.println("\nMax Integer In Array:\n");
        System.out.println(a.returnMax(new int[] {1, 2, 3}));
        System.out.println(a.returnMax(new int[] {1, 2, 7, 3}));
        System.out.println(a.returnMax(new int[] {9, 2, 12, 6, 2, 21}));
        System.out.println("\nMin Integer In Array:\n");
        System.out.println(a.returnMin(new int[] {1, 2, 3}));
        System.out.println(a.returnMin(new int[] {1, 2, 7, 3}));
        System.out.println(a.returnMin(new int[] {9, 2, 12, 6, 2, 21}));
        System.out.println("\nMin String In Array:\n");
        System.out.println(a.returnMinString(new String[] {"Hello,", "world", "!"}));
        System.out.println(a.returnMinString(new String[] {"The,", "fitness", "grams"}));
        System.out.println(a.returnMinString(new String[] {"one,", "hundred", "percentage"}));
        System.out.println("\nMax String In Array:\n");
        System.out.println(a.returnMaxString(new String[] {"Hello,", "world", "!"}));
        System.out.println(a.returnMaxString(new String[] {"The,", "fitness", "gram"}));
        System.out.println(a.returnMaxString(new String[] {"one,", "hundred", "percentage"}));
        System.out.println("\nLargest Difference of Two Arrays:\n");
        System.out.println(a.largestArrayDifference(new int[] {2, 3, 4}, new int[] {-1, -2, -3}));
        System.out.println(a.largestArrayDifference(new int[] {1, 2, 3, 4, 5}, new int[] {-1, -2, -3, -4, -5}));
        System.out.println(a.largestArrayDifference(new int[] {Integer.MAX_VALUE, 0, 1}, new int[] {100, 1000, Integer.MAX_VALUE}));
        System.out.println("\nMean Of Array:\n");
        System.out.println(a.meanArray(new double[] {2.0, 3.0, 4.0, 5.0}));
        System.out.println(a.meanArray(new double[] {10.0, 100.0, 1000.0}));
        System.out.println(a.meanArray(new double[] {-100.0, 0, 100.0}));
        System.out.println("\nReverse Array\n");
        printList(a.reverseOrder(new int[] {1, 2, 3}));
        printList(a.reverseOrder(new int[] {10, 9, 8, 7, 6}));
        printList(a.reverseOrder(new int[] {1, 3, 5, 7, 9}));
        System.out.println("\nConsecutive Values:\n");
        System.out.println(a.consecutiveValues(new int[] {1, 2, 3, 3, 4}));
        System.out.println(a.consecutiveValues(new int[] {1, 2, 3, 4, 5}));
        System.out.println(a.consecutiveValues(new int[] {1, 2, 3, 2, 1}));
        System.out.println("\nFirst Negative Value:\n");
        System.out.println(a.firstNegative(new int[] {1, 0, -1}));
        System.out.println(a.firstNegative(new int[] {10, 9, -1, -2}));
        System.out.println(a.firstNegative(new int[] {111, 10, 121}));
        System.out.println("\nSame Values\n");
        System.out.println(a.sameValues(new int[] {1, 2, 3, 4, 0, 0, 1}));
        System.out.println(a.sameValues(new int[] {1, 2, 3, 2}));
        System.out.println(a.sameValues(new int[] {9, 8, 7, 6, 5}));
        System.out.println("\nLongest Streak");
        System.out.println(a.longestStreak(new int[] {1, 2, 1, 1, 1}, 1));
        System.out.println(a.longestStreak(new int[] {1, 2, 3, 3, 0}, 3));
        System.out.println(a.longestStreak(new int[] {1, 2, 3, 4, 5}, 6));
        System.out.println(a.lastAlphabetic(new String[] {"zebra", "alpha"}));
        System.out.println(a.lastAlphabetic(new String[] {"apple", "banana", "pineapple"}));
        System.out.println(a.lastAlphabetic(new String[] {"zillow", "airbnb", "trivago"}));
    }
}
