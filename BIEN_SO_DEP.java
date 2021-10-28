package codePtit;

import java.util.*;

public class Test {
    public static boolean check1(List<Integer> a){
        int c = 0;
        for (int i = 1; i< a.size(); i++){
            if (a.get(i) <= a.get(i-1))
                c = 1;
        }
        if (c == 1) return false;
        return  true;
    }
    public static boolean check2(List<Integer> a){
        int c = 0;
        for (int i = 1; i< a.size(); i++){
            if (a.get(i) != a.get(i-1))
                c = 1;
        }
        if (c == 1) return false;
        return  true;
    }
    public static boolean check3(List<Integer> a){
        int c = 0;
        for (int i = 0; i< a.size(); i++){
            if (a.get(i) != 6 && a.get(i) != 8)
                c = 1;
        }
        if (c == 1) return false;
        return  true;
    }
    public static boolean check4(List<Integer> a){
        int c = 0;
        for (int i = 1; i<= 2; i++){
            if (a.get(i) != a.get(i-1))
                c = 1;
        }
        if (a.get(4) != a.get(3))
            c = 1;
        if (c == 1) return false;
        return  true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<String> a = new ArrayList<>();
        while(n-->0){
            a.add(s.next());
        }
        for (String i : a){
            String b[] = i.substring(5).split("");
            List<Integer> p = new ArrayList<>();
            for (String j: b){
                if(Character.isDigit(j.charAt(0)))
                    p.add(Integer.valueOf(j));
            }
            if (check1(p) || check2(p) || check3(p) || check4(p))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}