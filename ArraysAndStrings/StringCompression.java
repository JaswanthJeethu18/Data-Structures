package ArraysAndStrings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(compress(str));
    }

    public static String compress(String str){
        int countConsecutive = 0;
        String compressString = "";
        for(int  i =0 ; i< str.length();i++){
            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressString += ""+str.charAt(i)+countConsecutive;
                countConsecutive = 0;
            }
        }
        //this will return the compressed string if the compressed string length is lesser than the original string
        // Example-> input = aabb, Output = aabb because input string and original string will be of the same length
        //you can modify this by changing the condition in the return statement to <=
        return compressString.length() <= str.length() ? compressString : str;
    }
}
