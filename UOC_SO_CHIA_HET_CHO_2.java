package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n > 0){
            long a = s.nextLong();
            if(a%2 != 0) System.out.println("0");
            else{
                long  c = 0;
                long i =1;
                for(i = 1;i<=Math.sqrt(a);i++){
                    if(a%i ==0 ){
                        if(i%2 ==0)
                            c++;
                        if((a/i)%2 ==0)
                            c++;
                    }
                }
                i--;
                if ((i * i == a) && (i % 2 == 0))
                {
                    c--;
                }
                System.out.println(c);
            }
            n--;
        }
    }
}
