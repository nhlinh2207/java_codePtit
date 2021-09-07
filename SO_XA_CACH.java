package codePtit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    static boolean check1(int n, int a[]){
        for(int i=0;i<n;i++){
            if(a[i]!=n-i) return false;
        }
        return true;
    }

    static boolean check2(int n, int a[]){
        for(int i = 0;i<n-1;i++){
            if(Math.abs(a[i] - a[i+1]) <= 1)
                return false;
        }
        return true;
    }

    static void sinh(int n,int a[]){
        int j=n-2;
        while(j>0&&a[j]>=a[j+1]) j--;
        int k=n-1;
        while(a[k]<=a[j]) k--;
        int t = a[k];
        a[k]= a[j];
        a[j]= t;
        int l=j+1, r=n-1;
        while(l<=r){
            int temp = a[l];
            a[l]= a[r];
            a[r]= temp;
            l++;r--;
        }
    }
    static void in(int n, int a[]){
        for(int i=0;i<n;i++)
            System.out.print(a[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0){
             int num= s.nextInt();
             int a[]=new int[num];
             for (int i =0;i<num;i++)
                 a[i]= i+1;
             while (!check1(num, a)){
                 if (check2(num, a)){
                     in(num, a);
                 }
                 sinh(num, a);
             }
        }
    }
}
