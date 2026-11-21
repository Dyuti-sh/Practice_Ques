public class Q5 {

    public static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {100, 0 , 6};
        int[] ans = reverse(nums);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
