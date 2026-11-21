public class Q14 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        int mainDiagSum = 0;
        int secondaryDiagSum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j ++){
                if(i == j){
                    mainDiagSum += arr[i][j];
                }

                if((i + j) == arr.length - 1){
                    secondaryDiagSum += arr[i][j];
                }
            }
        }

        System.out.println("Main Diagonal Sum: " + mainDiagSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagSum);
        System.out.println("Difference: " + (mainDiagSum - secondaryDiagSum));
    }
}
