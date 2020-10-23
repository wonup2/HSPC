
import java.util.*;
public class Permutation { 
	static ArrayList<String> input = new ArrayList<String>();
    public static void main(String[] args) {        
    	String str = "ABCDE"; 
        int n = str.length(); 
        permute(str, 0, 3); 
        System.out.println(input);
    }       
    static void permute(String str, int l, int r){ 
        if (l == r) 
            input.add(str); 
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i);
                permute(str, l + 1, r);                
            } 
        } 
    } 
     static String swap(String a, int i, int j) { 
        char temp; 
        char[] c = a.toCharArray(); 
        temp = c[i]; 
        c[i] = c[j]; 
        c[j] = temp; 
        return String.valueOf(c); 
    } 
}
