package codePtit;

import java.util.*;

public class Test {
   static int check(int n, long k, long length[]){
       if(n == 1)return 0;
       if(n == 2)return 1;
       if(k > length[n-2]){
           return check(n-1, k-length[n-2],length);
       }
       return check(n-2, k ,length);
   }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long length[] = new long[93];
        length[1] = 1; length[2] = 1;
        for (int i = 3;i<=92;i++){
            length[i] = length[i-1]+length[i-2];
        }
        while(n-- > 0){
            int len = s.nextInt();
            long k = s.nextLong();
           long c = 0;
            System.out.println(check(len,k,length));
        }
    }
}
