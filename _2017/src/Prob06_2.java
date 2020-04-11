import java.util.*;

public class Prob06_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine().toLowerCase();
		int letter[] = new int[26]; 
		
		for(int i=0; i<s.length(); i++) 
			letter[s.charAt(i)-'a']++;
		
		int odd = 0;
		
		for(int i=0; i<26; i++) 
			if(letter[i]%2==1) odd++;
		
		if(odd<=1) System.out.println(1);
		else System.out.println(0);		
	}
}
