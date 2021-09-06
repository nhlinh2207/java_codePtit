package codePtit;

import java.util.*;

public class Test {
    public static int check(Long a[], int n){
        for(int i =1;i<n;i++){
            if(a[i]<a[i-1])
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = 1;
        int size = s.nextInt();
        Long a[] = new Long[size];
        for (int i = 0;i<size ;i++)
            a[i] = s.nextLong();
        int c = 0;
        System.out.println("Buoc 0: "+a[0]);
        for(int i = 1;i<size;i++){
            long  p = a[i];
            int j = i-1;
            while(j >= 0&& a[j] > p){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = p;
            if(check(a,size) == 0){
                System.out.print("Buoc "+d+": ");
                for(int l = 0;l<=d;l++) System.out.print(a[l]+" ");
                System.out.println();
                d++;
            }else break;
        }
        System.out.print("Buoc "+d+": ");
        for(Long l:a) System.out.print(l+" ");
        System.out.println();
    }
}
