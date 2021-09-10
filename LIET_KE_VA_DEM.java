package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    static class Pair{
        private String key;
        private int value;
        public Pair(String a, int b){
            key = a;
            value = b;
        }
        public String getKey(){return key;}
        public int getValue(){return value;}
    }

    static int check(String a){
        for (int i = 1; i<a.length(); i++){
            if((a.charAt(i)-'0') < (a.charAt(i-1)-'0'))
                return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        String res = "";
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            res += s.next()+" ";
        }
        List<String> list = new ArrayList<String>(Arrays.asList(res.split("\\s+")));
        Set<String> set = new LinkedHashSet<>();
        for(String i: list){
            if(check(i) == 1){
                set.add(i);
            }
        }
        Map<String, Pair> m = new LinkedHashMap<String, Pair>();
        for(String i: set){
            m.put(i,new Pair(i,Collections.frequency(list,i)));
        }
        List<Pair> fre = new ArrayList<>(m.values());
        Collections.sort(fre, Comparator.comparing(Pair::getValue,Comparator.reverseOrder()));
        for (Pair p: fre){
            System.out.println(p.getKey()+" "+p.getValue());
        }
    }
}
