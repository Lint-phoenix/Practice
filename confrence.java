import java.util.Arrays;

public class confrence {
    public static void main(String[] args) {
        int[] Start = {9, 11, 10, 10, 12};
        int[] End = {10, 12, 11, 11, 13};

        System.out.println("Minimum number of rooms required: "
                + MinRooms(Start, End));
    }

    public static int MinRooms(int[] Start, int[] End) {
        Arrays.sort(Start);
        Arrays.sort(End);

        int n = Start.length;
        int RoomsNeeded = 1;
        int result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (Start[i] <= End[j]) {
                RoomsNeeded++;
                i++;
            } else {
                RoomsNeeded--;
                j++;
            }
            result = Math.max(result, RoomsNeeded);
        }
        return result;
    }
}