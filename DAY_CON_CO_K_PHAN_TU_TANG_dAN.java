package codePtit;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static void in(int a[], int k){
        for (int i = 0;i< k; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    private static void T(int i, int k, int a[], int res[], int j){
        for (;j <= a.length - k + i; j++){
            res[i] = a[j];
            if (i < k-1)
                T(i+1, k, a, res, j + 1);
            else if (i == k-1) {
                in(res, k);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        while (m-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            int res[] = new int[k];
            int a[] = new int[n];
            for (int i = 0;i<n;i++){
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            T(0,k,a,res, 0);
        }
    }
}