package codePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test {
    static class WordSet{
        private Scanner s;
        private String filename;
        private Set<String> set;

        public WordSet(){}

        public WordSet(String a) throws FileNotFoundException {
            filename = a;
            set = new LinkedHashSet<>();
            s = new Scanner(new File(filename));
            while (s.hasNext()){
                set.add(s.next().toLowerCase());
            }
        }

        public Set<String> getSet(){return set;}

        public void setSet(Set<String> temp){
            set = new LinkedHashSet<>(temp);
        }

        public WordSet union(WordSet a){
            WordSet res = new WordSet();
            Set<String> temp = new LinkedHashSet<>(set);
            temp.addAll(a.getSet());
            List<String> t = new ArrayList<>(temp);
            Collections.sort(t);
            res.setSet(new LinkedHashSet<>(t));
            return res;
        }

        public WordSet intersection(WordSet a){
            WordSet res = new WordSet();
            List<String> temp = new ArrayList<>(set);
            temp.addAll(a.getSet());
            Map<String, Integer> m = new LinkedHashMap<>();
            for (String i : temp){
                if (m.containsKey(i)){
                    m.put(i, m.get(i)+1);
                }else{
                    m.put(i, 1);
                }
            }
            List<String> t = new ArrayList<>();
            for (String i: m.keySet()){
                if (m.get(i) >= 2)
                   t.add(i);
            }
            Collections.sort(t);
            res.setSet(new LinkedHashSet<>(t));
            return res;
        }

        @Override
        public String toString() {
            String res = "";
            for (String i : set)
                res+=i+" ";
            return res;
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main461461(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main9064035(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
