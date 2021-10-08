package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int n = s.nextInt();
        while(n-->0){
            String a = s.next();
            long tong = m.get(a.charAt(0));
            for (int i = 1;i<a.length(); i++){
                if (m.get(a.charAt(i)) <= m.get(a.charAt(i-1)))
                    tong += m.get(a.charAt(i));
                else{
                    tong -= m.get(a.charAt(i-1));
                    tong += m.get(a.charAt(i)) - m.get(a.charAt(i-1));
                }
            }
            System.out.println(tong);
        }
    }
}