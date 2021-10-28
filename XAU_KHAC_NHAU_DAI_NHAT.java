package codePtit;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            String a = s.next();
            String b = s.next();
            if (a.equals(b))
                System.out.println("-1");
            else{
                System.out.println(a.length() > b.length() ? a.length(): b.length());
            }
        }
    }
}