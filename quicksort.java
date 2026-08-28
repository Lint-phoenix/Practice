import java.util.Arrays;
public class quicksort {
    public static void QuickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = partition(arr, low, high);

            QuickSort(arr, low, pivot - 1);
            QuickSort(arr, pivot + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array:");
        printArray(arr);

        QuickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
