package DuiLie.numSquares;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author: Mr_liao
 * @create: 2022-10-19 16:45
 * @description:
 **/
public class numSquaresCode {
    public static void main(String[] args) {

    }

    public int numSquares(int n){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);

        Set<Integer> set = new HashSet<>();
        set.add(0);
        int level = 0;
        while (!queue.isEmpty()){

            int size = queue.size();
            level++;

            for (int i = 0; i < size; i++) {
                Integer cur = queue.poll();

                for (int j = 1; j < n; j++) {
                    int value = cur + j*j;

                    if (value == n){
                        return level;
                    }

                    if (value > n){
                        break;
                    }

                    if (!set.contains(value)){
                        queue.offer(value);
                        set.add(value);
                    }
                }
            }
        }
        return level;
    }

    //TODO 动态规划，学会该思想后再回来做 20221019
}
