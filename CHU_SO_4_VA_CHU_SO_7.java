package codePtit;

import java.util.Scanner;

public class Test {
    static void check(String a){
        int tong = 0;
        for (int i = 0;i<a.length(); i++){
            if (a.charAt(i) == '4' || a.charAt(i) == '7')
                tong++;
        }
        if (tong == 4 ||tong ==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        check(a);
    }
}