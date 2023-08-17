package ArraysAndStrings;

public class GridUniquePairs {
    public static int uniquePaths(int m, int n) {
        int N = m + n -2;
        int r = m -1;
        double ans = 1;
        for(int i =1; i <= r ; i++){
            ans = ans*(N - r + i) / i;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int totalCount= uniquePaths(2,3);
        System.out.println(totalCount);
    }
}
