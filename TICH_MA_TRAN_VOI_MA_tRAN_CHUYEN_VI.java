package codePtit;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int dem = 1;
        while(num-->0) {
            int n = s.nextInt();
            int m = s.nextInt();
            List<List<Integer>> a = new ArrayList<List<Integer>>();
            for (int i = 0;i<n;i++){
                List<Integer> temp = new ArrayList<>();
                for (int j = 0;j<m; j++){
                    int t = s.nextInt();
                    temp.add(t);
                }
                a.add(temp);
            }
            int res[][] = new int[n][n];
            for(int i = 0;i<a.size();i++){
                List<Integer> temp = a.get(i);
                ;for (int j = 0;j<a.size();j++){
                    for (int k = 0;k<a.get(j).size();k++){
                        res[i][j] += temp.get(k)*a.get(j).get(k);
                    }
                }
            }
            System.out.println("Test "+dem+":");
            for (int i = 0;i<n;i++){
                for (int j = 0;j<n;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
            dem++;
        }
    }
}
