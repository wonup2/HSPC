import java.util.*;
import java.io.*;

public class Prob01{
	
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);

		String s = in.nextLine(); //1-800-CALL-NOW
		String ans = "";
		for(int i=0; i<s.length(); i++)
			ans += change(s.charAt(i));
			
		System.out.println(ans);
		
	}
	
	static char change(char c) {
		if (c == 'A' || c == 'B' || c == 'C') return '2';
		else if (c == 'D' || c == 'E' || c == 'F') return '3';
		else if (c == 'G' || c == 'H' || c == 'I') return '4';
		else if (c == 'J' || c == 'K' || c == 'L') return '5';
		else if (c == 'M' || c == 'N' || c == 'O') return '6';
		else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') return '7';
		else if (c == 'T' || c == 'U' || c == 'V') return '8';
		else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') return '9';
		else return c;
	}
}




/*
3
4
-1
3
0
*/
