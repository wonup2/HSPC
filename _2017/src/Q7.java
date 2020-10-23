/*
4
hee
hey
bee
hay


*/


import java.util.*;
public class Q7 {
	
	static ArrayList<Integer>[] a;
	static int n; 
	static String[] s;
	static Scanner in;
	static boolean[] v;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
		solve();		
	}
	
	static void init() {
		
		n = in.nextInt(); in.nextLine();
		s = new String[n];
		for(int i=0; i<n; i++)
			s[i]=in.nextLine();
		
		System.out.println(Arrays.toString(s));
		
		a = new ArrayList[n];
		for(int i=0; i<n; i++)
			a[i] = new ArrayList<Integer>();
		
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(check(s[i], s[j])) {
					a[i].add(j);
					a[j].add(i);
				}				
			}
		}
		System.out.println(Arrays.toString(a));
	}
	static void solve() {
		for(int i=0; i<n; i++) {
			v=new boolean[n];		

			dfs(i);
			System.out.println(i);
			if(ok()) {
				System.out.println(1); 
				return;
			}
		}
		System.out.println(0);
	}
	
	static void dfs(int i) {
		if(v[i]) { v=new boolean[n]; return;}
		v[i] = true; System.out.println(i);
		for(int x:a[i]) {
			if(!v[x]) dfs(x);
		}
	}
	static boolean ok() {
		System.out.println(Arrays.toString(v));
		for(int i=0; i<n; i++) {			
			if(v[i]==false) return false;
		}
		return true;
	}
	
	static boolean check(String a, String b) {
		int d=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)!=b.charAt(i)) d++;
		}
		return d<=1;
	}

}
