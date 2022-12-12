package DuiLie.Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 10:38
 * @description: 一个队列，性质为先进先出，包含以下功能：
 * 1 添加元素的功能
 * 2 删除元素的功能
 * 3 判断队列是否为空
 * 4 弹出元素的功能
 **/
public class MyQueue2 {
    private List<Integer> data;
    private int head;

    public MyQueue2(){
        data = new ArrayList<>();
        head = 0;
    }

    public boolean addQueue(int x){
        data.add(x);
        return true;
    }

    public boolean deleteQueue(){
        //先判断队列是否为空
        if (isEmpty() == true){
            return false;
        }
        head++;
        return true;
    }

    public int popQueue(){
        return data.get(head);
    }

    public boolean isEmpty(){
        return head >= data.size();
    }
}
