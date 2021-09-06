package codePtit;

import java.util.*;

public class Test {
    static void solon(int m, int tong){
        int s = tong;
        int a[] = new int[m];
        if(s==0){
            System.out.print((m == 1)?"0":"-1");
            return;
        }
        if(s>9*m){
            System.out.print("-1");
            return;
        }
        for (int i =0;i<m;i++){
            if(s>9){
                a[i]=9;
                s-=9;
            }else{
                a[i] = s;
                s = 0;
            }
        }
        for(int i:a){
            System.out.print(i);
        }
    }
    static void sonho(int m, int tong){
        int s = tong;
        int a[] = new int[m];
        if(s == 0){
            System.out.print((m==1)?"0":"-1");
            return;
        }
        if(s>9*m){
            System.out.print("-1");
            return;
        }
        s-=1;
        for (int i = m-1;i>0;i--){
            if(s>9){
                a[i] = 9;
                s-=9;
            }else{
                a[i] = s;
                s = 0;
            }
        }
        a[0] = s+1;
        for (int i : a) System.out.print(i);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int tong = s.nextInt();
        sonho(m,tong);
        System.out.print(" ");
        solon(m, tong);
        System.out.println();
    }
}
