import java.util.ArrayList;

public class Q13 {
    public static void main(String[] args) {
        int[] num1 = {1, 4, 7, 10, 15};
        int[] num2 = {2, 3, 8, 12};
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < num1.length && j < num2.length){
            if(num1[i] < num2[j]){
                list.add(num1[i]);
                i++;
            } else{
                list.add(num2[j]);
                j++;
            }
        }

        while(i < num1.length){
            list.add(num1[i]);
            i++;
        }

        while(j < num2.length){
            list.add(num2[j]);
            j++;
        }

        System.out.println(list);
    }
}
