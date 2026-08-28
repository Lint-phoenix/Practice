public class price {
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        int left = 0;
        int right = arr.length-1;
        int sum = 0;
        boolean is50 = true;
        for (int i = 0; i > arr.length-1; i++){
            sum += arr[i]+arr[i+1];
            if (sum == 50){
                is50 = true;
            }
        }
        if (is50){
            System.out.println("pair that adds up to 50 exists");
        }
        else{
            System.out.println("pair that adds up to 50 doesn't exists");
        }
    }
}
