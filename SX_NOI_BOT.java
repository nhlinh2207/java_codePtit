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
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    long t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            if(check(a,size) == 0) {
                System.out.print("Buoc " + d + ": ");
                for (Long l : a) System.out.print(l + " ");
                System.out.println();
                d++;
            }
        }
        System.out.print("Buoc " + d + ": ");
        for (Long l : a) System.out.print(l + " ");
        System.out.println();
        d++;
    }
}
