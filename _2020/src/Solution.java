import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'onesGroups' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY grid
     *  2. INTEGER_ARRAY queries
     */
    static int n, m, cnt;
    static int[][]a;
    public static List<Integer> onesGroups(List<List<Integer>> grid, List<Integer> queries) {
        n=grid.size();
        m=grid.get(0).size();
        a = new int[n][m];
        for(int i=0; i<n; i++)
        	for(int j=0; j<m; j++)
        		a[i][j]=grid.get(i).get(j);
        
        System.out.println(Arrays.deepToString(a));
        
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for(int i:queries)
            map.put(i,0);
       //System.out.println(n+" "+m);
        for(int i=0;i<n; i++){
            for(int j=0;j<m; j++){
                if(a[i][j]==1){
                    cnt=0;
                    dfs(i, j);   
                    //System.out.println(i+" "+j+" "+cnt);
                    if(map.containsKey(cnt)) map.put(cnt, map.get(cnt)+1);
                }
            }
        }
        System.out.println(map);
        return queries;
    }
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,1,-1};
    public static void dfs(int i, int j){
        if(a[i][j]==0) return;
        a[i][j]=0; cnt++;   //System.out.println(cnt);
        for(int t=0; t<4; t++){
            int nx=i+dx[t];
            int ny=j+dy[t];             //System.out.println(nx+" "+ny);

            if(nx<0||nx>=n||ny<0||ny>=m||a[nx][ny]==0) continue;
            dfs(nx, ny); 
        }
    }
}
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gridRows = Integer.parseInt(bufferedReader.readLine().trim());
        int gridColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> grid = new ArrayList<>();
        IntStream.range(0, gridRows).forEach(i -> {
            try {
                grid.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.onesGroups(grid, queries);

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );

        bufferedReader.close();
       // bufferedWriter.close();
    }
}

/*
6
6
1 1 1 1 1 1
1 1 0 0 0 0
0 0 0 1 1 1
0 0 0 1 1 1
0 0 1 0 0 0
1 0 0 0 0 0
4
6
1
8
2

*/

