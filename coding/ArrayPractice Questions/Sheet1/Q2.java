import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int eveCount = 0;
        int oddCount = 0;

        for(int num : arr){
            if(num % 2 == 0){
                eveCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers in the array is:" + eveCount);
        System.out.println("Odd numbers in the array is:" + oddCount);
    }
}
