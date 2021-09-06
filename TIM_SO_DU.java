package codePtit;

import java.util.*;

public class Test {

    static int fnMod(String str)
    {
       int s= 0;
       for(int i = 0;i<str.length();i++){
           s = (s*10+str.charAt(i)-'0')%4;
       }
       return s !=0 ? 0 : 4;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while (num-->0){
           String str = s.next();
           System.out.println(fnMod(str));
        }
    }
}
