package codePtit;
import java.util.*;

public class Test {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       List<List<Integer>> res = new ArrayList<List<Integer>>();
       for (int i = 0;i<n; i++){
           List<Integer> t = new ArrayList<>();
           for (int j = 0;j<3;j++){
               t.add(s.nextInt());
           }
           res.add(t);
       }
       int kq = 0;
       for (List<Integer> i : res){
           if (i.stream().filter(j -> j == 1).count() > i.stream().filter(j -> j == 0).count())
               kq++;
       }
        System.out.println(kq);
    }
}