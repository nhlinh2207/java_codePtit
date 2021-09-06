package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while(num > 0){
            int val = s.nextInt();
            int a[] = new int[val];
            for(int i = 0;i<val;i++){
              a[i] = s.nextInt();
            }
            int b[] = new int[val];
            b[0] = a[0];
            for (int i = 1;i<val;i++){
                b[i] = b[i-1]+a[i];
            }
            int c = 0;
            for(int i = 1 ;i<val;i++){
                if(b[i-1] == b[val-1]-b[i]){
                    System.out.println(i+1);
                    c = 1;
                    break;
                }
            }
            if( c== 0){
                System.out.println("-1");
            }
            num--;
        }
    }
}
