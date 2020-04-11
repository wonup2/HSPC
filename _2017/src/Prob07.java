import java.util.*;

public class Prob07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String[] s = new String[n];
		for(int i=0; i<n; i++)
			s[i] = in.next();
		
		int[][] a = new int[n][n];
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(check(s[i], s[j])) {
					a[i][j] = 1;
					a[j][i] = 1;
				}
			}
		}
		
		//spanning tree
		
		
	}

	static boolean check(String a, String b) {
		int count=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)!=b.charAt(i)) count++;
		}
		return count <= 1;
	}
}

/*
4
hee
hey
bee
hay
*/
