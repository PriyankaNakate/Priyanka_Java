import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] grid = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j] = sc.nextInt();
            }
        }
        int ans = islandPerimeter(grid);
        System.out.println(ans);
    }
    public static int islandPerimeter(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ans += 4;
                    if (i >0 && grid[i-1][j] == 1) {
                        ans -= 2;
                    }
                    if (j>0&& grid[i][j-1] == 1) {
                        ans -= 2;
                    }
                }
            }
        }
        return ans;

    }
}