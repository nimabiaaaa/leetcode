package Tree.TwoTreeTest.wallsAndGates;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-12 14:11
 * @description: 墙与门
 **/
public class Solution {
    //房间的值
    private static final int EMPTY = Integer.MAX_VALUE;
    //门的值
    public static final int GATE = 0;
    //方向数组
    public static final List<int[]> DIRECTIONS = Arrays.asList(
            new int[] {1,0},//下
            new int[] {-1,0},//上
            new int[] {0,1},//右
            new int[] {0,-1}//左
    );

    public void wallsAndGates(int[][] rooms){
        int m = rooms.length; //行数
        if (m == 0){
            return;
        }

        int n = rooms[0].length; //列数
        //定义一个队列，存储所有门的坐标
        Queue<int[]> q = new LinkedList<>();
        //获取二维数组中所有门的坐标
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (rooms[row][col] == GATE){
                    q.add(new int[]{row,col});
                }
            }
        }

        //广度优先遍历
        while (!q.isEmpty()){
            int[] point = q.poll(); //取出一个门的坐标
            int row = point[0]; //行
            int col = point[1]; //列
            // 下、上、右、左四个方向挨着的坐标进行处理
            for (int[] direction : DIRECTIONS) {
                int r = row + direction[0];
                int c = col + direction[1];
                //1 超出边界：r < 0 || c < 0 || r >= m || c >= n
                //2 不是房间：rooms[r][c] != EMPTY
                //算法中为什么不需要比较当前房间到底距离哪个门近，是因为哪个门，谁先到这个房间，把INF值置为离他的距离，则说明肯定是到他更近
                if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY){
                    continue;
                }
                // 如果它是房间，则把它设置为跟门的距离
                rooms[r][c] = rooms[row][col] + 1;
                q.add(new int[] {r,c});
            }
        }
    }
}
