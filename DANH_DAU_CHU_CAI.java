package codePtit;
import java.util.*;

public class Test {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String a = s.next();
       Set<Character> res = new LinkedHashSet<>();
       for (int i = 0;i<a.length(); i++)
           res.add(a.charAt(i));
        System.out.println(res.size());
    }
}