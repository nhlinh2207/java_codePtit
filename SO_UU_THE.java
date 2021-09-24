package codePtit;

import java.util.Scanner;

public class Test {
    public static String check(String a){
        int c = 0, l =0;
        for (int i = 0; i<a.length(); i++){
            if (Character.isDigit(a.charAt(i)) == false)
                return "INVALID";
            else if ((a.charAt(i) -'0') %2 == 0)
                c++;
            else if ((a.charAt(i) -'0') %2 == 1)
                l++;
        }
        if (a.startsWith("0"))
            return "INVALID";
        else if (c>l && a.length() %2 == 0 || l>c && a.length() %2 == 1)
            return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0){
           String a = s.next();
            System.out.println(check(a));
        }
    }
}