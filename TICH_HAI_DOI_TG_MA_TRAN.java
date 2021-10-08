package codePtit;
import java.math.BigInteger;
import java.util.*;

public class Test {
    static class Matrix{
        private int n;
        private int m;
        private int a[][];
        public Matrix(int n, int m){
            a = new int[n][m];
            this.n = n;
            this.m = m;
        }

        public void nextMatrix(Scanner sc){
            for (int i = 0; i< n;i++){
                for (int j = 0;j<m;j++){
                    a[i][j] = sc.nextInt();
                }
            }
        }

        public int[][] getA(){return a;}

        public Matrix mul(Matrix b){
            Matrix c = new Matrix(n, b.getM());
            for (int i = 0;i<n; i++){
                for (int j = 0;j<b.getM(); j++){
                    c.getA()[i][j] = 0;
                    for (int k = 0;k<m; k++){
                        c.getA()[i][j] += a[i][k]*b.getA()[k][j];
                    }
                }
            }
            return c;
        }

        public int getN(){return  n;}
        public int getM(){return  m;}

        @Override
        public String toString() {
            String res = "";
            for (int i = 0; i<n;i++){
                for (int j = 0;j<m;j++){
                    res += a[i][j]+" ";
                }
                res +="\n";
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
    public static void main4765156(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
