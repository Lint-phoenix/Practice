import java.util.Scanner;

public class lexico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int K = sc.nextInt();
        String Smallest = S.substring(0,K);
        String Largest = S.substring(0,K);
        for(int i=0; i<S.length()-K; i++){
            String Current = S.substring(i, i+K);
            if(Current.compareTo(Smallest)<0){
                Smallest = Current;
            }
            if(Current.compareTo(Largest)>0){
                Largest = Current;
            }
        }
        System.out.println(Smallest);
        System.out.println(Largest);
    }
}
