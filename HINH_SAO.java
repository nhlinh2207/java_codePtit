package codePtit;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = n, c = n-1;
        Map<Integer,Set<Integer>> m = new HashMap<Integer, Set<Integer>>();
        while(c-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            if (!m.containsKey(a)) {
                m.put(a, new LinkedHashSet<Integer>());
                Set<Integer> temp = m.get(a);
                temp.add(b);
                m.put(a, temp);
            }
            else {
                Set<Integer> temp = m.get(a);
                temp.add(b);
                m.put(a, temp);
            }
            if (!m.containsKey(b)) {
                m.put(b, new LinkedHashSet<Integer>());
                Set<Integer> temp = m.get(b);
                temp.add(a);
                m.put(b, temp);
            }
            else {
                Set<Integer> temp = m.get(b);
                temp.add(a);
                m.put(b, temp);
            }
        }
        Set<Map.Entry<Integer, Set<Integer>>> e = m.entrySet();
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Set<Integer>> i: e){
            res.add(i.getValue().size());
        }
        if (!res.contains(p-1)){
            System.out.println("No");
        }else if (res.stream().filter(i -> i>1 && i<p-1).count() >=1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}