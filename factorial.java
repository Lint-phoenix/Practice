import java.util.Scanner;

public class factorial {
    public static int fact(int x){
        if (x == 0 || x == 1){
            return 1;
        }
        return x * fact(x-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to get factorial: ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is: "+factorial.fact(n));
    }
}
