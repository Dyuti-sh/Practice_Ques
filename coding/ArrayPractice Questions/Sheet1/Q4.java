public class Q4 {

    public static int search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 5;
        int target = 8;
        int[] enrollment = {5, 8, 12, 8, 20};
        System.out.println(search(enrollment, target));
    }
}
