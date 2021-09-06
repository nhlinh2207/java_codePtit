package codePtit;

import java.util.*;

public class Test {
    static boolean ktra(int th[], int n, int k){
        for (int i = 0;i<k;i++){
            if(th[i] != n-k+i+1) return false;
        }
        return true;
    }
    static void sinh(int th[], int n, int k){
        int i = k-1;
        while(i>=0 && th[i] == n-k+i+1) i--;
        th[i]++;
        for(int j = i+1;j<k;j++){
            th[j] = th[i]+(j-i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int th[] = new int[k];
        List<String> res = new ArrayList<>();
        for(int i = 1;i<=k; i++){
            th[i-1] = i;
        }
        while (!ktra(th,n,k)){
            String temp = "";
            for(int i:th){
                temp+=i+" ";
            }
            res.add(temp);
            sinh(th,n,k);
        }
        String temp1 = "";
        for(int i:th){
            temp1+=i+" ";
        }
        res.add(temp1);
        for (String i:res){
            System.out.println(i);
        }
        System.out.println("Tong cong co "+res.size()+" to hop");
    }
}

