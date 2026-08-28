import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 0; i<=n; i++){
            System.out.println(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}