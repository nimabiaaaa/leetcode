package Tree.TwoTreeTest.wallsAndGates;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-12 15:21
 * @description:
 **/
public class Solution2 {
    public static final int EMPTY = Integer.MAX_VALUE;
    public static final List<int[]> DIRECTION = Arrays.asList(
            new int[] {1,0}, //下
            new int[] {-1,0},  //上
            new int[] {0,1}, //右
            new int[] {0,-1} //左
    );
    public static final int GATE = 0;
    public void wallsAndGates(int[][] rooms){
        int m = rooms.length; //行
        if (m == 0){
            return;
        }

        int n = rooms[0].length; //列
        //定义一个队列，存储每个门的坐标
        Queue<int[]> q = new LinkedList<>();
        //将所有门的坐标存进队列
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (rooms[row][col] == GATE){
                    q.add(new int[]{row,col});
                }
            }
        }

        //进行广度优先遍历，对二维数组进行遍历
        while (!q.isEmpty()){
            int[] point = q.poll(); //弹出一个门的坐标

            int row = point[0]; //行
            int col = point[1]; //列

            //向上下左右进行遍历，遇到房间就加一
            for (int[] direction : DIRECTION){
                int r = row + direction[0];
                int c = col + direction[1];

                //过滤掉以下的情况
                //1 超出边界
                //2 遇到不是房间的
                if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY){
                    continue;
                }

                //遇到房间的话,设置他到门的距离加1
                rooms[r][c] = rooms[r][c] + 1;
                q.add(new int[]{r,c});//将该门的坐标加入队列，待后续继续处理
            }
        }
    }
}
