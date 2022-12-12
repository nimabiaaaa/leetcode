package DuiLie.MovingAverage;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 15:38
 * @description: 数据流中的移动平均值
 **/
public class MovingAverage {
    private Queue<Integer> queue;
    private int maxSize;
    private float sum;

    public MovingAverage(int size){
        queue = new LinkedList<>();
        maxSize = size;
    }

    double next(int x){
        sum = 0;
        if (queue.size() >= maxSize){
            //如果当前队列的元素数量大于移动窗口的大小，则弹出队首元素
            queue.poll();
            queue.offer(x);
        }else {
            queue.offer(x);
        }

        for (Integer v:queue){
            sum += v;
        }

        return (sum*1.0)/queue.size();
    }
}
