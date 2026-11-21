import java.util.LinkedHashMap;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 30};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int num : map.keySet()){
            System.out.println("Element: " + num + " Frrequency: " + map.get(num));
        }
    }
}

//it can be done using arraylist+hashmap, hashmap+hashset;
