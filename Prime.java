public class Prime {
    public static void main(String[] args){
        int num = 19;
        for(int i=1; i<19; i++){
            if (num%i==0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
        }
    }
}
