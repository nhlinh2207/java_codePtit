package codePtit;

import java.util.Scanner;

public class Test {
    static int check(String a){
        int tong = a.charAt(0)-'0';
        for (int i = 1;i<a.length(); i++){
               if (Math.abs((a.charAt(i) - '0') - (a.charAt(i-1) - '0')) != 2)
                   return 0;
               else
                   tong += (a.charAt(i) - '0');
        }
       if (tong %10 == 0)
           return 1;
       return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a = sc.next();
            if (check(a) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}