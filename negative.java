import java.util.*;

public class negative {
    public static void printFirstNegatives(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                dq.addLast(i);
            }

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    System.out.print(arr[dq.peekFirst()] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        printFirstNegatives(arr, k);
    }
}
