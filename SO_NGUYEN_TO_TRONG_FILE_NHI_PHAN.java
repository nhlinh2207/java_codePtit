package codePtit;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int n = 10000;
        boolean check[] = new boolean[n+1];
        for(int i = 2; i<=n;i++){
            check[i] = true;
        }
        for (int i =2 ;i<=n;i++){
            if (check[i]){
                for(int j = 2*i; j<= n; j+=i){
                    check[j] = false;
                }
            }
        }

        FileInputStream fis = new FileInputStream("SONGUYEN.in");
       ObjectInputStream is = new ObjectInputStream(fis);
       List<Integer> a = (List<Integer>) is.readObject();
       Collections.sort(a);
       Map<Integer, Integer> b= new LinkedHashMap<>();
       for (Integer i : a){
           if (check[i]) {
               if (b.containsKey(i)) {
                   b.put(i, b.get(i) + 1);
               } else {
                   b.put(i, 1);
               }
           }
       }
       for (Integer i : b.keySet()){
           System.out.println(i+" "+b.get(i));
       }
    }
}