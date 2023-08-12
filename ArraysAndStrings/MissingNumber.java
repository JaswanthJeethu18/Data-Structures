package ArraysAndStrings;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        System.out.println(missingNumber(arr));
    }

    //Solution 1 : Brute force approach
    /*public static int missingNumber(int[] arr){
        int i =1;
        for(i =1 ; i < arr.length ; i++){
            int flag = 0;
            for(int j = 0 ; j < arr.length ; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
        }
        return i;
    }*/

    //Solution 2 : Optimal Solution
    public static int missingNumber(int[] arr){
        int n = arr.length, s2 = 0;
        int sum = (n*(n+1))/2;
        for(int i =0 ; i< n ; i++){
            s2 = s2 + arr[i];
        }
        return sum - s2;
    }
}
