package codePtit;

import java.util.Scanner;

public class Test {
    public static int check (long n){
        if(n%2 ==0 ) return 0;
        for(int i = 2 ;i<Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n > 0){
            long c = s.nextLong();
            if(check(c) == 1) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}
