import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String Sentence = sc.nextLine();
        int character = 0;
        int vowels =0;
        String lower = Sentence.toLowerCase();
        for (int i = 0; i<lower.length(); i++){
            char ch = lower.charAt(i);
            if (ch != ' '){
                character+=1;
            }
            if(ch =='a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                vowels +=1;
            }
        }
        System.out.println("Number of Characters in the given sentence: "+character);
        System.out.println("Number of Vowels in the given sentence: "+vowels);
        System.out.println(Sentence.substring(0, 16));
        sc.close();
    }
}