package DuiLie.numIslands;

/**
 * @author: Mr_liao
 * @create: 2022-10-13 13:54
 * @description:
 **/
public class Solution2 {
    public int numIslands(char[][] grid) {
        int m = grid.length;

        if (m == 0){
            return 0;
        }

        int sum = 0;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    DFS(grid,i,j);
                    sum++;
                }
            }
        }

        return sum;
    }

    private void DFS(char[][] grid, int i, int j) {
        //1 判断当前坐标是否越界
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;
        }

        //2 判断当前是否是岛屿
        if (grid[i][j] != '1'){
            return;
        }

        //3 将遍历过的岛屿的坐标置为2，防止重复遍历
        grid[i][j] = '2';

        //4 递归遍历，向当前坐标的四周进行遍历
        DFS(grid,i -1,j);
        DFS(grid,i+1,j);
        DFS(grid,i,j-1);
        DFS(grid,i,j+1);

    }
}
