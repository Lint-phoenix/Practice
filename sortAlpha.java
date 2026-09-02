import java.util.Arrays;

public class sortAlpha {
    public static void main(String[] args) {
        String word = "gigasea";

        char[] chars = word.toCharArray();

        Arrays.sort(chars);
        String sortedWord = new String(chars);

        System.out.println("Original word: " + word);
        System.out.println("Sorted word: " + sortedWord);
    }
}
