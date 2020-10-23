import java.util.*;
 
public class Q3 { 
	static String a, b;
	static int cnt, n,  arr[], combArr[];
	
    public static void main(String[] ar){  
    	Scanner in = new Scanner(System.in);
    	
    	a = in.nextLine();
        n = a.length();

    	arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=i;        
        
        b = in.nextLine();
        int r = b.length();
        combArr = new int[r];
        cnt=0;
        
        comb(r, 0, 0);
        System.out.println(cnt);
    }

    static public void comb(int r, int index, int target){
        if(r == 0){
        	String s="";
            for(int i=0; i<index; i++) {
            	s+=(a.charAt(arr[combArr[i]])+"");
            }
            if(s.equals(b)) cnt++;
        }
        
        else if(target == n) return;
        
        else{
            combArr[index] = target;
            comb(r-1, index+1, target+1);   // (i)
            comb(r, index, target+1); 		//(ii)
        }
    }
}