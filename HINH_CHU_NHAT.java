package codePtit;

import java.util.*;

public class Test {


    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         long cd,cr;
         cd = s.nextLong();
         cr = s.nextLong();
         if(cd <= 0 || cr<=0) System.out.println("0");
         else
         System.out.println((cd+cr)*2+" "+cd*cr);
    }
}
