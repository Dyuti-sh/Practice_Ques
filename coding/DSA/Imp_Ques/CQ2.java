class CQ2{
    public static void main(String[] args){
        String inp1 = "Rohit";
        String inp2 = "Roy";
        int pin = 462038;
        int n = 2;

        String output = "";
        String smallString = "";
        String largeString = "";

        if(inp1.length() > inp2.length()){
            largeString += inp1;
            smallString += inp2;
        } else if(inp1.length() == inp2.length()){
            //use compareto method to compare two string using their ascii values
        } else{
            smallString += inp1;
            largeString += inp2;
        }

        String r = String.valueOf(pin);
        output += smallString.toLowerCase().charAt(0) + largeString + r.charAt(n - 1) + r.charAt(r.length() - n);
        System.out.println(output);
    }
}