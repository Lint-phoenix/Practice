import java.util.Scanner;

public class even {
    public static void printEvenNumbers(int[] arr) {
        System.out.println("The even numbers in the array are: ");
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        printEvenNumbers(arr);
    }
}
