import java.util.*;

public class Prob06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		Map<Character, Integer> letter = new HashMap<Character, Integer>();		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(letter.containsKey(c)) letter.put(c, letter.get(c)+1);
			else letter.put(c,1);
		}
		
		int odd = 0;		
		for(char c: letter.keySet()) 
			if(letter.get(c)%2==1) odd++;
		
		if(odd<=1) System.out.println(1);
		else System.out.println(0);	
		
		in.close();
	}
}