public class Main {
    public static void printList(int[] i) {
        for(int j : i) System.out.print(j);
        System.out.println();
    }
    public static void printList(String[] s) {
        for(String str : s) System.out.print(str);
        System.out.println();;
    }
    public static void main(String[] args) {
        Algorithms a = new Algorithms();
        a.printArray(new int[]{1, 2, 3});
        a.printArray(new int[]{1, 2, 7, 3});
        a.printArray(new int[]{1, 7, 8});
        printList(a.swapArrayIndex(new int[]{1, 2, 3, 4}, 1, 2));
        printList(a.swapArrayIndex(new int[]{1, 2, 7, 3}, 0, 3));
        printList(a.swapArrayIndex(new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3}, 0, 2));
        System.out.println(a.returnMax(new int[] {1, 2, 3}));
        System.out.println(a.returnMax(new int[] {1, 2, 7, 3}));
        System.out.println(a.returnMax(new int[] {9, 2, 12, 6, 2, 21}));
        System.out.println(a.returnMin(new int[] {1, 2, 3}));
        System.out.println(a.returnMin(new int[] {1, 2, 7, 3}));
        System.out.println(a.returnMin(new int[] {9, 2, 12, 6, 2, 21}));
        System.out.println(a.returnMinString(new String[] {"Hello,", "world", "!"}));

    }
}
