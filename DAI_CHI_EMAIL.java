package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.nextLine();
        List<String> list = new ArrayList<>();
        while (n > 0){
            String str = s.nextLine();
            str = str.trim();
            str = str.toLowerCase();
            List<String> r = new ArrayList<String>(Arrays.asList(str.split("\\s+")));
            String res = r.get(r.size()-1);
            for (int i = 0 ;i<r.size()-1;i++){
                res+=Character.toString(r.get(i).charAt(0));
            }
            if (!list.contains(res)){
                list.add(res);
                System.out.println(res+"@ptit.edu.vn");
            }else{
               int c = Collections.frequency(list, res);
               list.add(res);
               res+=Integer.valueOf(c+1).toString()+"@ptit.edu.vn";
               System.out.println(res);
            }
            n--;
        }
    }
}