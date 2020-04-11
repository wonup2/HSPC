import java.util.*;
public class Prob08_bfs {
	static int[][] a;
	static int i; static int j;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int r = in.nextInt(); 
		int c = in.nextInt();
		
		int[][] a = new int[r][c];
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				a[i][j] = in.nextInt();
			}
		}
		
		int count=0;
		Map<Integer, Integer> t = new HashMap<Integer, Integer>();
		
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				int res=isLand(a, i, j);				
				if(res > 0) { 
					count++; 
					if(t.containsKey(res))
						t.put(res, t.get(res)+1);
					else t.put(res, 0);
				}
			}
		}
		
		System.out.println(count);
		System.out.println(t);
	}

	public static int isLand(int[][] a, int x, int y){
		if(x<0||x>=a[0].length||y<0||y>=a.length) return 0;
		else if(a[x][y] !=1) return 0;
		else{
			a[x][y] = 2;  //flag on visited position
			return 1+isLand(a, x, y+1)+isLand(a, x, y-1)+isLand(a, x+1, y)+isLand(a, x-1, y);
		}
	}	
}
