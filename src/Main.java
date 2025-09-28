import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new Random().ints(n, 0, 100).toArray();

        Metrics m = new Metrics();

        System.out.println("Before sorting:");
        printArray(arr);

        MergeSort.sort(arr, m);

        System.out.println("After MergeSort:");
        printArray(arr);
        System.out.printf("Depth=%d, Comparisons=%d%n", m.maxDepth, m.comparisons);
    }

    private static void printArray(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
