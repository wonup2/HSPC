import java.util.*;
public class Prob04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		
		int n = in.nextInt();
		String ans = "";		
		for(int i=0; i<n; i++)
			ans += in.next();
		
		ans = Integer.parseInt(ans) + 1 + "";		
		
		for(int i=0; i<ans.length(); i++)
			System.out.println(ans.charAt(i));		
		in.close();
	}
}
