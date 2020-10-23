
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s1 = in.nextLine().toLowerCase().replaceAll("[^a-z]", "");
		String s2 = in.nextLine().toLowerCase().replaceAll("[^a-z]", "");

		int[] a = new int[26];
		int[] b = new int[26];
		String check = "True";
		
		for(int i=0; i<s1.length(); i++) a[s1.charAt(i)-'a']++;
		
		for(int i=0; i<s2.length(); i++) b[s2.charAt(i)-'a']++;		
		
		for(int i=0; i<26; i++)	if(a[i]>b[i]) check= "False";
		
		System.out.println(check);
	}
}

/*
if you call the cops...
a song of ice and fire: a novel
False

pay up pal!
apples are pretty lucky.
True
*/