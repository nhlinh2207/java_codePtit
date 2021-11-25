package codePtit;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int n = 1000000;
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

       FileInputStream fis = new FileInputStream("DATA1.in");
       ObjectInputStream is = new ObjectInputStream(fis);
       List<Integer> temp1 = (List<Integer>) is.readObject();
       Collections.sort(temp1);
       Set<Integer> a = new LinkedHashSet<Integer>(temp1);
       
       fis = new FileInputStream("DATA2.in");
       is = new ObjectInputStream(fis);
       List<Integer>temp2 = (List<Integer>) is.readObject();
       Set<Integer> b= new LinkedHashSet<Integer>(temp2);

       
       Map<Integer, Integer> m = new LinkedHashMap<>();
       
       for (Integer i : a){
         if(check[i] && check[1000000 - i]  && a.contains(1000000 - i) && i< 1000000 - i && !b.contains(i) && !b.contains(1000000 - i)){
             m.put(i, 1000000 - i);
         }
       }
       
       for (Integer i : m.keySet()){
           System.out.println(i+" "+m.get(i));
       }
    }
}