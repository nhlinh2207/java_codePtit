package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0){
            long a = s.nextLong();
            long b= s.nextLong();
            long d = (a<b) ? a : b;
            long uc = 0;
            for(long i = d;i>=1; i--){
                if(a%i ==0 && b%i == 0){
                    uc = i;
                    break;
                }
            }
            long bc = a*b/uc;
            System.out.println(bc+" "+uc);
            n--;
        }
    }
}
