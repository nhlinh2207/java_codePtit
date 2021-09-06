package codePtit;

import java.util.*;

public class Test {
   static  long uc(long a, long c){
       long t1 = a,t2 = c;
       while(t1!=t2){
           if(t1>t2) t1-=t2;
           else t2-=t1;
       }
       return t1;
   }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-- > 0){
           long a = s.nextLong();
           s.nextLine();
           String b = s.nextLine();
           long c = 0;
           for (int i = 0;i<b.length();i++){
               c = c*10 + (b.charAt(i) - '0');
               c %= a;
           }
            System.out.println(uc(a,c));
        }
    }
}
