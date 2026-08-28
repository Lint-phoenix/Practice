public class strings {
    public static void main(String[] args){
        String a = new String ("Siya");
        String b = new String("Siya");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String s = " ";
        for (int i = 0; i<500; i++){
            s+=i;
            System.out.println(s);
        }
    }
}
