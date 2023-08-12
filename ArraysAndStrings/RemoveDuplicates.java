package ArraysAndStrings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4};
        int ans = removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] arr){
        int i = 0 ;
        for(int j=1 ; j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = a[j];
                i++;
            }
        }
        return (i+1);
    }
}
