//string(input) : Fi_er
//string(input) : FEVER:filer:Filter:offer:FiBer:FiBre:Fixer:Tailor
//Output: String: FILER:FIBER:FIXER
//else Output: String : Error-009

class Q1{
    // public static void main(String[] args){
    //     String s = Fi_er;
    //     String t = FEVER:filer:Filter:offer:FiBer:FiBre:Fixer:Tailor;
    //     int j = 0;
    //     int i = 0;

    //     while(i < t.length()){
    //         while(t.charAt(j) != ':'){
    //             j++;
    //         }
    //         StringBuilder sb = t.substring(i, j);

    //         for(int k = 0; k < s.length(); k++){

    //         }
    //     }
    // }

    public static void main(String[] args){
        String inp1 = Fi_er;
        String inp2 = FEVER:filer:Filter:offer:FiBer:FiBre:Fixer:Tailor;
        String output = " ";

        int indx = 

        for(String r : s){
            String temp = inp1;
            char ch = r.charAt(indx);
            temp = temp.replace('_', ch);
            if(r.equalsIgnoreCase(temp)){
                output = output+r+":";
            }
        }
    }
}