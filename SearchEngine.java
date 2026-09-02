import java.util.*;

public class SearchEngine {
    private Set<String> dictionary;

    public SearchEngine(List<String> words) {
        dictionary = new HashSet<>(words);
    }

    public boolean isValidWord(String word) {
        return dictionary.contains(word.toLowerCase());
    }

    public List<String> suggestByPrefix(String prefix) {
        List<String> suggestions = new ArrayList<>();
        for (String word : dictionary) {
            if (word.startsWith(prefix.toLowerCase())) {
                suggestions.add(word);
            }
        }
        return suggestions;
    }

    public List<String> suggestByEditDistance(String input, int maxDistance) {
        List<String> suggestions = new ArrayList<>();
        for (String word : dictionary) {
            if (levenshteinDistance(input.toLowerCase(), word) <= maxDistance) {
                suggestions.add(word);
            }
        }
        return suggestions;
    }

    private int levenshteinDistance(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = Math.min(
                            dp[i - 1][j - 1] + (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1),
                            Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1)
                    );
                }
            }
        }
        return dp[a.length()][b.length()];
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "application", "banana", "band", "google", "good", "goal");
        SearchEngine engine = new SearchEngine(words);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        if (engine.isValidWord(input)) {
            System.out.println("Word is valid!");
        } else {
            System.out.println("Word not found. Suggestions:");
            System.out.println("By prefix: " + engine.suggestByPrefix(input));
            System.out.println("By edit distance: " + engine.suggestByEditDistance(input, 2));
        }
    }
}
