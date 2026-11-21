public class Q6 {
    public static void main(String[] args) {
        int[] list = {10, -5, 20, 0 , -8, 0, 15};
        int negCount = 0;
        int posCount = 0;
        int zeroCount = 0;

        for(int num : list){
            if(num == 0){
                zeroCount++;
            } else if(num > 0){
                posCount++;
            } else{
                negCount++;
            }
        }

        System.out.println("Positive: " + posCount);
        System.out.println("Negative: " + negCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}
