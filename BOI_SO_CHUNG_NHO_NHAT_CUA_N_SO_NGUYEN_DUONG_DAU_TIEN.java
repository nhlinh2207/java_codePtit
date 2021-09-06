package codePtit;
import java.util.*;
public class Test {
    static long uc(long a, long b){
        if(a%b != 0)
            return uc(b,a%b);
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0){
            int m = s.nextInt();
            long res = 1;
            for(int i = 1;i<=m;i++){
                res = (res*i)/uc(res,i);
            }
            System.out.println(res);
            n--;
        }
    }
}
