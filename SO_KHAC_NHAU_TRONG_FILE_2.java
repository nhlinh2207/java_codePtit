package codePtit;
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream is = new FileInputStream("DATA.IN");
        DataInputStream dis = new DataInputStream(is);
        List<Integer> a = new ArrayList<>();
        Object o = null;
        boolean eof = false;
        while (!eof){
           try {
               o = dis.readInt();
               a.add((Integer)o);
           }catch (EOFException e){
               eof = true;
           }
        }
        Collections.sort(a);
        Map<Integer, Integer> m = new LinkedHashMap<>();
        for (Integer i : a){
            if (m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }
        for(Integer i: m.keySet()){
            System.out.println(i+" "+m.get(i));
        }
    }
}