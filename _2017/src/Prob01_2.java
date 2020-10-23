import java.util.*;

public class Prob01_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
						
		//get data
		//process and output			
		while(in.hasNextLine()){
			String s = in.nextLine();  //1-800-CALL-NOW
			System.out.println(convert(s));
		}		
		
		in.close();
	}	
	
	static String convert(String s){
		String ret = "";
		for(int i=0; i<s.length(); i++){
			ret += change(s.charAt(i));
		}
		return ret;
	}
	
	static char change(char c){
		if('A' <= c && 'Z' >= c){
			return (char)((c-'A')/3 + 2+'0');
		}
		else return c;
	}
}


