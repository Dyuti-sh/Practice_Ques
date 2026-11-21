class Q1{

    public static int calTotal(int[] arr){
        int total = 0;
        for(int num : arr){
            total += num;
        }
        return total;
    }

    public static void main(String[] args){
        int n = 4;
        int[] marks  = {10, 20, 30, 40};
        System.out.println("Total: " + calTotal(marks));
        float avg = (float) calTotal(marks) / n;
        System.out.printf("Average: %.2f%n" , avg);
    }
}