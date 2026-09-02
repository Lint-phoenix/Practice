import java.util.Arrays;

public class platform {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1120, 1130, 1200, 1900, 2000};

        System.out.println("Minimum number of platforms required: "
                + MinPlatforms(arrival, departure));
    }

    public static int MinPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;
        int platformsNeeded = 1;
        int result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platformsNeeded++;
                i++;
            } else {
                platformsNeeded--;
                j++;
            }
            result = Math.max(result, platformsNeeded);
        }
        return result;
    }
}