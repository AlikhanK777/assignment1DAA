public class MergeSort {
    public static void sort(int[] arr, Metrics m) {
        mergeSort(arr, 0, arr.length - 1, m, 1);
    }

    private static void mergeSort(int[] arr, int left, int right, Metrics m, int depth) {
        if (left < right) {
            int mid = (left + right) / 2;

            if (depth > m.maxDepth) m.maxDepth = depth;

            mergeSort(arr, left, mid, m, depth + 1);
            mergeSort(arr, mid + 1, right, m, depth + 1);
            merge(arr, left, mid, right, m);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, Metrics m) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            m.comparisons++;
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
