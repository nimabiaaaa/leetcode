package Stacks.DFS.numIslandsCode;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 13:49
 * @description: 岛屿数量
 **/
public class Solution {
    public static void main(String[] args) {

    }
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    count++;

                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {

        //边界判断
        if (i < 0 || i >=grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j - 1);
        dfs(grid,i,j + 1);
    }

}
