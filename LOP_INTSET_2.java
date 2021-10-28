package codePtit;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class IntSet{
        private TreeSet<Integer> s;

        public IntSet(int[] a){
            s = new TreeSet<Integer>();
            for (int i = 0;i<a.length; i++){
                s.add(Integer.valueOf(a[i]));
            }
        }

        public IntSet(TreeSet<Integer> b){
            s = b;
        }

        public IntSet union(IntSet b){
            TreeSet<Integer> res = new TreeSet<>(s);
            for (Integer i: b.getS()){
                res.add(i);
            }
            return new IntSet(res);
        }

        public IntSet intersection(IntSet b){
            TreeSet<Integer> res = new TreeSet<>();
            List<Integer> temp = new ArrayList<>(s);
            temp.addAll(new ArrayList<Integer>(b.getS()));
            Set<Integer> set = new LinkedHashSet<>(temp);
            for (Integer i: set){
                if (Collections.frequency(temp, i) >=2)
                    res.add(i);
            }

            return new IntSet(res);
        }

        public TreeSet<Integer> getS(){
            return s;
        }

        @Override
        public String toString() {
            String string = "";
            for (Integer i: s){
                string += i+" ";
            }
            return  string;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}