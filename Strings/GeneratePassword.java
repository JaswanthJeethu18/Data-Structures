package Strings;

import java.util.Scanner;

class GeneratePassword
{
    static void genPW(char[] arr, int n, String password)
    {
        if (password.length() == n) {
            System.out.println(password);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            genPW(arr, n, password + arr[i]);
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n, "");
    }
}
