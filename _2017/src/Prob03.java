import java.util.*;

public class Prob03 {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine(); //3+5+7-2=		
		int ans = s.charAt(0)-'0';		
		for(int i=1; i<s.length()-1; i++){			
			char op = s.charAt(i++);			
			int num = s.charAt(i)-'0';			
			if(op=='+') ans += num;
			else if(op=='-') ans -= num;			
		}		
		
		System.out.println(ans);
	}
}
