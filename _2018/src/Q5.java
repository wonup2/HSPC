

import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) a[i] = in.nextInt();		
		boolean check = false;

		for(int i=a.length-1; i>=0; i--) {
			check = false;
			if(a[i]==0) {
				int jump = 2;
				for(int j=i-1; j>=0; j--) {
					if(a[j]>=jump) check = true;
					jump++;
					i--;
				}
			}
		}
		
		System.out.println(check);
	}
}

/*
5
3
1
0
1
3
True

6
3
2
1
0
2
3
False
*/