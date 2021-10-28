package codePtit;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("VANBAN.in"));
        String a = "";
        int k = 0;
        while (s.hasNextLine()){
            a += s.nextLine().toLowerCase()+" ";
        }
        String b[] = a.split("\\W\\s*");
        Map<String, Integer> m = new HashMap<>();
        List<String> temp = new ArrayList<>(Arrays.asList(b));
        temp.remove(0);
        for (String i :temp){
            if (!i.equals("")) {
                if (m.containsKey(i)) {
                    m.put(i, m.get(i) + 1);
                } else {
                    m.put(i, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> t = new ArrayList<>(m.entrySet());
        Collections.sort(t, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(t, (o1,o2) -> o2.getValue().compareTo(o1.getValue()));
        t.forEach(i -> System.out.println(i.getKey()+" "+i.getValue()));
    }
}