import java.util.*;

public class Q3_dfs {

	static ArrayList<Integer>[] a;
	static Scanner in;
	static String x, y; 
	static int len;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
		solve();
	}

	static void init() {
		x=in.nextLine();
		y=in.nextLine();
		
		len = x.length();
		a = new ArrayList[len];
		for(int i=0; i<len; i++) {
			a[i] = new ArrayList<Integer>();
			for(int j=i+1; j<len; j++)
				a[i].add(j);
		}
		
		//System.out.println(Arrays.toString(a));
	}
	
	static void solve() {
		for(int i=0; i<len; i++) {
			dfs(i, i+"");
		}
	}
	static void dfs(int i, String s) {
		if(s.length()==y.length()) {
			System.out.println(s);
			s="";
		}
		//System.out.println(s);
		for(int n:a[i])
			dfs(n, s+n);
	}
}
