public class SubString1 {
    public static void main(String[] args){
        String str = "aba";
        for (int i = str.length(); i >= 1; i--){
            System.out.println(str.substring(0,i));
        }
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
}