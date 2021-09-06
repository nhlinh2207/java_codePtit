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
        int d = 1;
        int size = s.nextInt();
        List<String> res = new ArrayList<>();
        Long a[] = new Long[size];
        for (int i = 0;i<size ;i++)
            a[i] = s.nextLong();
        int c = 0;
        String temp = "Buoc 0: "+a[0];
        res.add(temp);
        for(int i = 1;i<size;i++){
            long  p = a[i];
            int j = i-1;
            while(j >= 0&& a[j] > p){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = p;
            if(check(a,size) == 0){
                String t = "Buoc "+d+": ";
                for(int l = 0;l<=d;l++)
                    t += a[l]+" ";
                res.add(t);
                d++;
            }else break;
        }
        String t2 = "Buoc "+d+": ";
        for(Long l:a)
            t2 += l+" ";
        res.add(t2);
        for(int i = res.size() - 1; i>=0; i--){
            System.out.println(res.get(i));
        }
    }
}
