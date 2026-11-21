public class Q15 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30},
                        {40, 50, 60},
                        {15, 25, 35}};

        int rowSum = 0;
        int colSum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum);
            rowSum = 0;
        }

        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                colSum += arr[j][i];
            }
            System.out.println("Column " + (i + 1) + " Sum: " + colSum);
            colSum = 0;
        }
    }
}
