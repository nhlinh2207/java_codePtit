package codePtit;

import java.util.*;

public class Test {
    public static int check(Long a[], int n){
        for(int i =1;i<n;i++){
            if(a[i]<a[i-1])
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n >0) {
            int d = 1;
            List<String> res = new ArrayList<>();
            int size = s.nextInt();
            Long a[] = new Long[size];
            for (int i = 0; i < size; i++)
                a[i] = s.nextLong();
            for (int i = 0; i < size - 1; i++) {
                for (int j = i+1; j < size ; j++) {
                    if (a[i] > a[j]) {
                        long t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }
                if (check(a, size) == 0) {
                    String temp = "Buoc "+d+": ";
                    for (Long l : a)
                           temp += (l+" ");
                    res.add(temp);
                    d++;
                }
            }
            String temp = "Buoc "+d+": ";
            for (Long l : a)
                  temp += (l+" ");
            res.add(temp);
            d++;
            for (int i = res.size()-1;i>=0;i--){
                System.out.println(res.get(i));
            }
            n--;
        }
    }
}
