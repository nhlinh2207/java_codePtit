package codePtit;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0;i<n;i++){
            List<Integer> res = new ArrayList<>();
            for (int j = 0; j < n ; j++){
                if(a[i][j] == 1){
                    res.add(j+1);
                }
            }
                System.out.print("List("+(i+1)+") = ");
                for (Integer k : res){
                    System.out.print(k+" ");
                }
                System.out.println();
        }
    }
}
