public class ShopKeeper {
    public static void main(String[] args){
        int arr [] = {-2, 3, -1, 4, -5};
        int Currentsum = arr[0];
        int Maxsum = arr[0];

        for (int i = 0; i < arr.length-1; i++){
            Currentsum = Math.max(arr[i], Currentsum+arr[i]);
            Maxsum = Math.max(Maxsum, Currentsum);
        }
        System.out.println(Maxsum);
    }
}
