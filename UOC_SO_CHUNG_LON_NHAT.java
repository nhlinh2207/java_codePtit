package usclnJ02036;

import java.util.Scanner;

public class J02036main {
	public static long gcd(long a,long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static long lcm(long a,long b) {
		return a*b/gcd(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			System.out.print(a[0]+" ");
			for(int i=0;i<n-1;i++) {
				long ans=lcm(a[i], a[i+1]);
				System.out.print(ans+" ");
			}
			System.out.println(a[n-1]);
		}
	}

}