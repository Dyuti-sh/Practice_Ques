public class Q12 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 8, 0, 2, 6};
        int i = 0;
        int j = i + 1;
        while(i < arr.length || j < arr.length){
            if(arr[i] == 0 || arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            i++;
            j++;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
