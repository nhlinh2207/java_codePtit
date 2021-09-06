package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static int check(long a){
        for (long i =2 ;i<Math.sqrt(a); i++){
            if(a%i ==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n > 0){
            long a = s.nextLong();
            long c = 0;
            while(a%2 ==0){
                a/=2;
                c = 2;
            }
            while(a%3 == 0){
                c = 3;
                a/=3;
            }
            for(long i =5 ;i<=Math.sqrt(a);i+=6){
                while(a%i ==0 ){
                    a/=i;
                    c = i;
                }
                while(a%(i+2) == 0){
                    a/=(i+2);
                    c = i+2;
                }
            }
            if(a > 4) c = a;
            System.out.println(c);
            n--;
        }
    }
}
