
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++)
			a[i] = in.nextInt();
		int s = in.nextInt();
		ArrayList<Integer> mins = new ArrayList<Integer>();
		TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
		for(int i =0;i<s;i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i], 0);
			}
			map.put(a[i], map.get(a[i])+1);
		}
		
		System.out.println(map);
		
		mins.add(map.firstKey());  System.out.println(mins);
		for(int i=s;i<n;i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i], 0);
			}
			System.out.println(map);
			
			map.put(a[i], map.get(a[i])+1);
			map.put(a[i-s], map.get(a[i-s])-1);
			if(map.get(a[i-s])==0)
				map.remove(a[i-s]);
			mins.add(map.firstKey());
		}
		System.out.println(mins);
	}

}
