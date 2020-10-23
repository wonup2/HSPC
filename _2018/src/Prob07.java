
import java.util.Arrays;
import java.util.HashMap;

public class Prob07 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
				int k=3;
		  Arrays.sort(a);
	        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
	        for(int i = 0; i < a.length; i++) {            
	                int t = (int)(k-a[i]);
	                int j = Arrays.binarySearch(a, t);
	                System.out.println(t+" " +j);
	                if(j>=0&&j>i){
	                    if(a[i] <= a[j])
	                        pairs.put(a[i], a[j]);
	                    else
	                        pairs.put(a[j], a[i]);       
	                }
	        }
	        System.out.println(pairs);
	        System.out.println(pairs.size());
	}
}
