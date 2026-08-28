public class twopointers {
    public static void main(String[] args){
        int arr [] = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = arr.length -1;
        int temp;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"," + " ");
        }
        System.out.print("}");
    }
}
