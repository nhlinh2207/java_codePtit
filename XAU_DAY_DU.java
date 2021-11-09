package xaudayduJ03031;

import java.util.HashSet;
import java.util.Scanner;

public class J03031main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			sc.nextLine();
			String s=sc.next();
			int k=sc.nextInt();
			HashSet<Character> set=new HashSet<Character>();
			for(int i=0;i<s.length();i++) {
				set.add(s.charAt(i));
			}
			if(set.size()+k>=26) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}