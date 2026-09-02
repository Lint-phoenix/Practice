import java.util.Scanner;

public class greedy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] Price = {10, 20, 30, 40, 50};
        int Money = 100;
        int ChocolatePrice = 50;
        int NoOfChoco = Money/ChocolatePrice;
        System.out.println("Chocolate Price "+ChocolatePrice);
        System.out.println("Number of chocolate: "+NoOfChoco);
        int MoneySpent = NoOfChoco*ChocolatePrice;
        System.out.println("money spent: "+MoneySpent);
        int MoneyLeft = Money - MoneySpent;
        System.out.println("Money left: "+MoneyLeft);
    }
}
