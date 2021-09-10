package codePtit;
import java.util.*;

public class Test {
    static int check(String a){
        return a.equals(new StringBuilder(a).reverse().toString()) ? 1: 0;
    }
    public static void main(String[] args) {
        String res = "";
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            res += s.next()+" ";
        }
        List<String> list = new ArrayList<String>(Arrays.asList(res.split("\\s+")));
        int c = 0;
        for (String i :list){
            if(check(i) == 1 && i.length() > c){
                c = i.length();
            }
        }
        List<String> set = new ArrayList<>();
        for(String i: list){
            if (!set.contains(i)){
                set.add(i);
            }
        }
        for(String i: set){
            if(i.length() == c && check(i) == 1)
                System.out.println(i+" "+Collections.frequency(list,i));
        }
    }
}
