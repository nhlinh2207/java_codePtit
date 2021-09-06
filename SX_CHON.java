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
        while(check(a,size) == 0) {
            for (int i = 0; i < size - 1; i++) {
                int index = -1;
                long p = a[i];
                for (int j = i + 1; j < size; j++) {
                    if (a[j] < p) {
                        p = a[j];
                        index = j;
                    }
                }
                if (p != a[i]) {
                    long temp = a[index];
                    a[index] = a[i];
                    a[i] = temp;
                }
                System.out.print("Buoc " + d + ": ");
                for (Long l : a) System.out.print(l + " ");
                System.out.println();
                d++;
            }
        }
    }
}
