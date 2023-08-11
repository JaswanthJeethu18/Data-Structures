package ArraysAndStrings;

public class OneAway {
    public static void main(String[] args) {
        String first = "apple";
        String second = "bpple";
        System.out.println(oneEditAway(first, second));
    }
    /*
    //Solution #1
    public static boolean oneEditAway(String first, String second){
        if(first.length() == second.length()){
            return oneEditReplace(first, second);
        } else if (first.length()+1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length()-1 == second.length()) {
            return oneEditInsert(second , first);
        }
        return false;
    }

    public static boolean oneEditReplace(String s1, String s2){ //1. apple baple
        boolean foundDifference = false;                        //2. false             // true
        for(int i=0; i<s1.length();i++) {                       //3. i=0               // i =1
            if (s1.charAt(i) != s2.charAt(i)) {                 //4. a != b => true    // p != a
                if (foundDifference) {                          // false               // true
                    return false;                                                      // return false -> program will return to main method
                }
                foundDifference = true;                         // true
            }
        }
        return true;
    }

    public static boolean oneEditInsert(String s1, String s2){  // 1. aple , apple
        int index1 =0;
        int index2 = 0 ;
        while(index2 < s2.length() && index1 < s1.length()){  //2. 0 < 5 && 0 < 4  //7. 1 < 5 && 1 <4       //12. 2<5 && 2<4          //16. 2 < 5 && 3<4
            if(s1.charAt(index1) != s2.charAt(index2)){     //3. a != a => false   //8. p != p => false     //13. l != p => true      //17. l != l => false
                if(index1 != index2){                                                                       //14. 2 != 2
                    return false;
                }
                index2++;                                                                                   //15. ind1 = 2  ind2 = 3
            }else {                                     // 4. ind1 =0 ind2 = 0     //9. ind1 =1  ind2 = 1                             //18. ind1=2  ind2=3
                index1++;                               // 5. ind1 = 1;            //10. ind1 = 2;                                    //19. ind1=3
                index2++;                               // 6. ind2 =1;             //11. ind2 = 2                                     //20. ind2=4
            }
        }
        return true;
    }*/

    public static boolean oneEditAway(String first , String second){
        //Length checks
        if(Math.abs(first.length() - second.length()) >1){
            return false;
        }

        //Get shorter and longer string
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first ;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index2 < second.length() != index1 < first.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(foundDifference) return false;
                foundDifference = true;

                if(s1.length() == s2.length()){
                    index1++;
                }
            }else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
