package ArraysAndStrings;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,2,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    //Optimul Solution
    static public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount =0;
        for(int  i =0 ; i<nums.length ; i++){
            if(nums[i] == 1){
                count++;
                if(count > maxcount){
                    maxcount++;
                }
            }else{
                count =0 ;
            }
        }
        return maxcount;
    }
}
