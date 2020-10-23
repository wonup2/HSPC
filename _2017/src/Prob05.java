import java.util.*;
public class Prob05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int ans = 0;
		for(int j = 1; j <= n/2; j++)		
			if(n % j == 0) ans += j;
					
		if(ans == n) System.out.println(1);
		else System.out.println(0);
		in.close();
	}
}