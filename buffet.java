public class buffet {
    static String[] food = {"rice", "dal", "paneer", "salad", "desert'"};
    static int[] Calories = {150, 100, 250, 50, 200};

    static int CaloriesLimit = 400;

    public static void findCombinations(int index, int currentCalorie, String currentPlate) {

        if (currentCalorie > CaloriesLimit){
            return;
        }

        //if we have considered all food items
        if(index == food.length){
            if(!currentPlate.isEmpty()){
                System.out.println(currentPlate+"-> Total: "+currentCalorie+" cal");
            }
            return;
        }

        //choice 1: to take this food
        findCombinations(index+1,
                currentCalorie + Calories[index],
                currentPlate + food[index]+" ");
        findCombinations(index+1, currentCalorie, currentPlate);
    }
    public static void main(String[] args){
        System.out.println("Possible buffet combination under " + CaloriesLimit + " calories:\n");
        findCombinations(0,0,"");
    }
}
