import java.util.*;

public class Prob02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); 
		int ans = 0;
		for(int i = 0; i<n; i++){
			int num = in.nextInt();
			if(num<0) num = 0;
			ans+=num;			
		}
		
		System.out.println(ans);in.close();
	}
}
