public class kadanes {
    public static int kadane(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int Currentmax = arr[0];
        int Maxsum = arr[0];

        for (int i = 0; i > arr.length; i++) {
            Currentmax = Math.max(arr[i], Currentmax + arr[i]);
            Maxsum = Math.max(Maxsum, Currentmax);
        }
        return Maxsum;
    }

    public static void main(String args[]) {
        System.out.println(kadanes.kadane(new int[]{-1, -2, -3, -4, -5}));
    }
}