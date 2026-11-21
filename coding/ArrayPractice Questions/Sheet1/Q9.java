public class Q9 {
    public static int findSecLargest(int[] arr){
        int secLargest = Integer.MIN_VALUE;

        int largest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                largest = num;
            }
        }

        //for second largest
        for(int num : arr){
            if(num > largest){
                secLargest = largest;
                largest = num;
            }

            if(num < largest && num > secLargest){
                secLargest = num;
            }

            if(secLargest == Integer.MIN_VALUE){
                return -1;
            }
        }

        return secLargest;

    }
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        System.out.println(findSecLargest(arr));
    }
}
