package UTS;

public class UTS26 {
    // Selection sort ascending
    public static void selectionSortAsc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Selection sort descending
    public static void selectionSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Binary search
    public static int binarySearch(int[] arr, int nilai) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == nilai) {
                return mid;
            } else {
                if (arr[left] == nilai) {
                    return left;
                }
                if (arr[right] == nilai) {
                    return right;
                }
                left++;
                right--;
            }
        }
        return -1;
    }

}
