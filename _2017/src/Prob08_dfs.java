import java.util.*;

public class Prob08_dfs {

	static int a[][],n,m;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		a = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		int ans=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j]==1) {
					dfs(i,j);
					ans++;
				}
			}
		}
		System.out.println(ans);
		
		in.close();
	}

	static void dfs(int x, int y) {
		a[x][y]=0;
		for(int dx=-1; dx<=1; dx++) {
			for(int dy=-1; dy<=1; dy++) {
				int nx = x+dx;
				int ny = y+dy;
				if(0>nx||nx>=n||0>ny||ny>=m) continue;
				if(a[nx][ny]==1) {
					dfs(nx, ny);
				}
			}
		}
	}
}
