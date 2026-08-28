public class Array{
    public static void main(String[] args){
        //initialize array with contigous element
        int arr [] = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int num:arr){
            sum+=num;
        }
        System.out.println(sum);

        double avg = (sum/(arr.length));
        System.out.println(avg);

        for (int i =0; i< arr.length; i++){
            if (arr[i]==30){
                System.out.println("The element 30 is found in the index "+i);
            }
        }
    }
}