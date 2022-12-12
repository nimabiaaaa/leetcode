package DuiLie.Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-07-18 07:42
 * @description:
 **/
class MyQueue {
    private List<Integer> data;
    private int head;

    public MyQueue(){
        data = new ArrayList<>();
        head = 0;
    }

    /**
     * 向队列中添加元素
     * @param x
     * @return
     */
    public boolean enQueue(int x){
        data.add(x);
        return true;
    }

    /**
     *  删除队列中的元素
     */
    public boolean deQueue(){
        //首先判断队列中元素是否为空，不为空，才可以进行删除操作
        //需要编写一个函数来判断队列是否为空
        if (isEmpty() == true){
            return false;
        }
        head++;
        return true;
    }

    /**
     * 从队列中获取元素
     * @return
     */
    public int Front(){
        return data.get(head);
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return head >= data.size();
    }
}
