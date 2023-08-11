package ArraysAndStrings;

import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(permutation(s,t));
    }
//    //Solution #1 : Sort the Strings.
//    public static boolean permutation(String s , String t){
//        if(s.length() != t.length()) {
//            return false;
//        }
//        return sort(s).equals(sort(t));
//    };
//    public static String sort(String s){
//        char[] content = s.toCharArray();
//        java.util.Arrays.sort(content);
//        return new String(content);
//     }
//}

//Solution #2: Check if two strings have identical character counts.
    public static boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[128]; //ASCII VALUE = 128;

        char[] s_array = s.toCharArray();
        for(char c :s_array){
            letters[c]++;
        }

        for(int i = 0 ; i < t.length(); i++){
            int c =(int) t.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }
        return true;
    }
}
