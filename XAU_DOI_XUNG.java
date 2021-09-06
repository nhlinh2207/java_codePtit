package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n>0){
            int c = 0;
            String res = s.nextLine();
            int b = res.length();
            if(b%2 == 0){
                String t1 = res.substring(0,b/2);
                String t2 = new StringBuilder(res.substring(b/2,b)).reverse().toString();
                for(int i = 0;i<t1.length();i++){
                    if (t1.charAt(i) != t2.charAt(i))
                        c++;
                }
            }else{
                int d = 0;
                String t1 = res.substring(0,(int)(b/2));
                String t2 = new StringBuilder(res.substring((int)(b/2)+1,b)).reverse().toString();
                for(int i = 0;i<t1.length();i++){
                    if (t1.charAt(i) != t2.charAt(i))
                        d++;
                }
                if (d == 1 || d == 0) c=1;
            }
            if(c == 1) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}