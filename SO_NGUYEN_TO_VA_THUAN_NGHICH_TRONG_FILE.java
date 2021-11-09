package snttrong2fileJ07016;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author This MC
 */
public class J07016main {
    public static boolean tn(int n){
        String ans1=String.valueOf(n);
        StringBuilder tmp1=new StringBuilder(ans1);
        String ans2=tmp1.reverse().toString();
        return ans1.equals(ans2);
        
    }   
    public static boolean checksnt(int n){
            if(n<2) return false;
            for(int i=2;i<=Math.sqrt(n);i++){
             if(n%i==0) return false;
            }
            return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ans1=(ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ans2=(ArrayList<Integer>) ois2.readObject();
        Map<Integer,Integer> m1 = new TreeMap<>();
        Map<Integer,Integer> m2 = new TreeMap<>();
        for(int i:ans1){
            if(m1.containsKey(i)){
                m1.put(i, m1.get(i)+1);
            }else{
                m1.put(i, 1);
            }
        }
        for(int i:ans2){
            if(m2.containsKey(i)){
                m2.put(i, m2.get(i)+1);
            }else{
                m2.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m2.entrySet()) {
            if(tn(entry.getKey())==true&&checksnt(entry.getKey())==true&&m1.containsKey(entry.getKey())){
                System.out.println(entry.getKey()+" "+m1.get(entry.getKey())+" "+entry.getValue());
            }
            
        }
    }
    
}