package ArraysAndStrings;

class ReverseNum
{
    public static void main(String[] args)
    {
        int num = 789456;
        int rev = 0;
        while(num != 0) //num is not eqal to 0
        {
            int div = num % 10; //  789456 % 10 == 6, 78945 % 10 == 5
            rev = rev * 10 + div;// It 1 : 6, it 2 = 65
            num /= 10;// 78945.6 
        }
        System.out.println(rev);
    }
}