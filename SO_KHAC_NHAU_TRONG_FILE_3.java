package codePtit;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       FileInputStream fis = new FileInputStream("DATA.in");
       ObjectInputStream is = new ObjectInputStream(fis);
       List<Integer> a = (List<Integer>) is.readObject();
       Collections.sort(a);
       Map<Integer, Integer> b= new HashMap<>();
       for (Integer i : a){
           if (b.containsKey(i)){
               b.put(i, b.get(i)+1);
           }else{
               b.put(i,1);
           }
       }
       for (Integer i : b.keySet()){
           System.out.println(i+" "+b.get(i));
       }
    }
}