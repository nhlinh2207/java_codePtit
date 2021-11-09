package test11022021;

import java.util.Scanner;
import java.util.Stack;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int b[]=new int[n];
			Stack<Integer> st=new Stack<Integer>();
			for(int i=n-1;i>=0;i--) {
				while(!st.empty()&&a[i]>=st.peek()) {
					st.pop();
				}
				if(st.empty()) {
					b[i]=-1;
				}else {
					b[i]=st.peek();
				}
				st.push(a[i]);
			}
			for(int i=0;i<n;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
		}
	}
}