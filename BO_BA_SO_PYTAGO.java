package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long m = s.nextLong();
        while(m>0) {
            int n = s.nextInt();
            long a[] = new long[n];
            List<Long> res = new ArrayList<>();
            int c= 0;
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                res.add((long) Math.pow(a[i], 2));
            }
            Collections.sort(res);
            for(int i = res.size()-1;i>=2;i--){
                int l = 0;
                int r = i-1;
                while(l<r){
                    if(res.get(l) + res.get(r) == res.get(i)){
                        c++;
                        break;
                    }
                    if(res.get(l) + res.get(r) < res.get(i)){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
            String k = "";
            if(c==1) k = "YES";
            else k = "NO";
            System.out.println(k);
            m--;
        }
    }
}