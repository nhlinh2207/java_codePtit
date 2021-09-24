package codePtit;

import java.util.*;

public class Test {
    public static String check(String a){
        List<Integer> res = new ArrayList<>();
        for (int i = 0;i<a.length();i++){
            if (a.charAt(i) == '1')
                res.add(1);
            else if (a.charAt(i) == '0' || a.charAt(i) == '8' ||a.charAt(i) == '9')
                res.add(0);
            else
                return "INVALID";
        }
        int c = 0;
        while (c<res.size() && res.get(c) == 0){
            c++;
        }
        if (c == res.size())
            return "INVALID";
        String b= "";
        for (int i = c ;i< res.size();i++){
            b += Integer.toString(res.get(i));
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            String a = s.next();
            System.out.println(check(a));
        }
    }
}