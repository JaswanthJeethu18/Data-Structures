package ArraysAndStrings;

public class PalindroomePermuatation {
    public static void main(String[] args) {
        String phrase  = "Jaswanthjsnth";
        boolean result = isPermutationOfPalindrome(phrase);
        System.out.println(result);
    }

    //Solution #1
    /*static boolean isPermutationOfPalindrome(String phrase){
        int[] table = buildCharacterFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    static int[] buildCharacterFrequencyTable(String phrase){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];
        for(Character c :phrase.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
            }
        }
        return table;
    }

    static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        if(a <= c && c <=z){
            return c -a;
        }
        return -1;
    }

    static boolean checkMaxOneOdd(int[] table){
        boolean foundOdd = false;
        for(int count: table){
            if(count%2 == 1){
                if(foundOdd = true){
                    return false;
                }
                foundOdd=true;
            }
        }
        return true;
    }*/

    //Solution #2
    public static boolean isPermutationOfPalindrome(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for (char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
                if(table[x] %2 ==1){
                    countOdd++;
                }else {
                    countOdd--;
                }
            }
        }
        return countOdd<=1;
    }

    static int getCharNumber(Character c){
        int a = Character.getNumericValue('a'); //Character.getNumericValue(..) in Java returns same number for upper and lower case characters
        int z = Character.getNumericValue('z');
        if(a <= c && c <=z){
            return c -a;
        }
        return -1;
    }

}


