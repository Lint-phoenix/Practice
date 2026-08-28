public class Ascending {
    public static void main(String[] args){
        int arr[] = { 50, 10, 20, 30, 40 };
        boolean isAsc = true;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                isAsc = false;
                break;
            }
        }
        if (isAsc){
            System.out.println("The array is in ascending order");
        }
        else{
            System.out.println("The array is not in ascending order");
        }
    }
}
