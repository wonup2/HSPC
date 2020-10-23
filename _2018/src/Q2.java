import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i]=in.nextInt();
		int m=in.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for(int i=0; i<m; i++) q.add(a[i]);
		int t=q.poll();
		ans.add(t);
		if(t!=a[0]) {
			q.add(t);
			q.remove(a[0]);
		}

		for(int i=m; i<n; i++) {
			q.add(a[i]);  		
			t=q.poll();
			ans.add(t);
			if(t!=a[i-m+1]) {
				q.add(t);q.remove(a[i-m+1]);
			}	

		}
		
		System.out.println(ans);
	}
}

/*
7
3
4
-5
5
2
-1
-2
3

[-5, -5, -5, -1, -2]
*/

/*
5
-1
1
0
2
-3
3
[-1, 0, -3]
*/
