import java.util.HashSet;

public class Q11{
    public static void main(String[] args){
        int[] arr = {101, 102, 101, 103, 102, 104, 103, 105};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }

        Integer[] ans = set.toArray(new Integer[0]);

        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}