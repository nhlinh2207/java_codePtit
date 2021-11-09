package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s= sc.next();
		ArrayList<ArrayList<Integer>> v =new ArrayList<ArrayList<Integer>>(1000);
		for(int i=0;i<100;i++) {
			v.add(new ArrayList<Integer>());
		}
		for(int i=0;i< s.length();i++) {
			v.get((int)(s.charAt(i)-'a')).add(i);
		}
		String tmp="";
		TreeSet st=new TreeSet();
		for(int i=0;i<s.length();i++) {
			st.add(s.charAt(i)-'a');
		}
		String ans="";
		int bound =0;
		for(int i='z'-'a';i>=0;i--) {
			if(st.contains(i)) {
				int sz=v.get(i).size();
				boolean check=false;
				for(int j=sz-1;j>=0;j--) {
					if(v.get(i).get(j)>=bound) {
						ans+=(char)('a'+i);
						check=true;
					}else {
						break;
					}
				}
				if(check)bound=v.get(i).get(sz-1)+1;
			}
		}
		System.out.println(ans);
	}

}