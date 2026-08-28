public class suitcase {
    static String[] clothes = {"shirt ", "trousers ", "pants ", "T-shirts ", "over coat ", "hats ", "belts ", "footwear "};
    static int[] weights = {200, 300, 250, 270, 500, 100, 100, 300};
    static int limit = 1500;

    public static void clothcombination(int index, int currentweight, String currentcase) {
        if (currentweight > limit) {
            return;
        }
        if (index == clothes.length) {
            if (!currentcase.isEmpty()) {
                System.out.println(currentcase + "-> Total: " + currentweight + " gms");
            }
            return;
        }
        clothcombination(index + 1, currentweight + weights[index], currentcase + clothes[index]);
        clothcombination(index + 1, currentweight, currentcase);
    }

    public static void main(String[] args) {
        System.out.println("Possible suitcase combination under " + limit + " grams:\n");
        clothcombination(0, 0, "");
    }
}