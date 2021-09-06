package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0){
            long k = s.nextLong();
            System.out.println(k*(2+(k-1))/2);
            n--;
        }
    }
}
