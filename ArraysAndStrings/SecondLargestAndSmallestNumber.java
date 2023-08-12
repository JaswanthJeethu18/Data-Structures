package ArraysAndStrings;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SecondLargestAndSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,7,5};
        int n = arr.length;
        int[] secondOrderElements = getSecondOrderElements(n, arr);
        System.out.println(Arrays.toString(secondOrderElements));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        int slargest = secondLargest(n , a);
        int ssmallest = secondSmallest(n, a);
        int[] ans = new int[2];
        ans[0] = slargest;
        ans[1] = ssmallest;
        return ans;
    }

    public static int secondLargest(int n , int[] a){
        int largest = a[0];
        int slargest = Integer.MIN_VALUE;

        for(int i =1 ; i<n; i++){
            if(a[i] > largest){
                slargest = largest;
                largest = a[i];
            }
            else if(a[i] < largest && a[i] > slargest){
                slargest= a[i];
            }
        }
        return slargest;
    }

    public static int secondSmallest(int n , int[]a){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i =1; i < n; i++){
            if(a[i] < smallest){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i] > smallest && a[i] < ssmallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
}
