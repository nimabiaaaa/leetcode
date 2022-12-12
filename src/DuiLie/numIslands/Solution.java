package DuiLie.numIslands;

/**
 * @author: Mr_liao
 * @create: 2022-10-12 17:08
 * @description: 岛屿数量
 **/
public class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if (m == 0){
            return 0;
        }
        int sum = 0;
        int n = grid[0].length;
        //遍历二维数组，获取岛屿值为1的坐标
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    //1 从初始1开始，通过DFS遍历出该岛屿所有坐标，并将其置为2
                    this.DFS(grid,i,j);
                    //2 岛屿数量加1
                    sum++;
                }
            }
        }
        return sum;
    }

    private void DFS(char[][] grid, int m, int n) {
        //1 判断当前位置是否越界
        if (m < 0 || n < 0 || m >=grid.length || n >= grid[0].length){
            return;
        }

        //2 判断当前坐标是否是岛屿
        if (grid[m][n] != '1'){
            return;
        }

        //3 将遍历过的岛屿节点坐标值置为2
        grid[m][n] = '2';
        //向四周遍历
        DFS(grid,m+1,n);
        DFS(grid,m,n+1);
        DFS(grid,m-1,n);
        DFS(grid,m,n-1);
    }
}
