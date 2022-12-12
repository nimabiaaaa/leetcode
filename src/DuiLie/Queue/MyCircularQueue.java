package DuiLie.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 11:04
 * @description:
 * MyCircularQueue(k): 构造器，设置队列长度为 k 。
 * Front: 从队首获取元素。如果队列为空，返回 -1 。
 * Rear: 获取队尾元素。如果队列为空，返回 -1 。
 * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
 * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
 * isEmpty(): 检查循环队列是否为空。
 * isFull(): 检查循环队列是否已满。
 *
 **/
public class MyCircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue(int k){
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    public boolean addQueue(int x){
        //因为是固定长度队列，所以插入元素前，需需判断队列是否已满
        if (isFull() == true){
            return false;
        }

        if (isEmpty() == true){
            head = 0;
        }

        tail = (tail + 1)%size;
        data[tail] = x;
        return true;
    }

    public boolean deleteQueue(){
        if (isEmpty() == true){
            return false;
        }

        if (head == tail){
            //说明本来就是空的，或者只剩下最后一个元素
            head = -1;
            tail = -1;
            return true;
        }
        //指向队列头部的指针向后移动一位
        head = (head + 1)% size;
        return true;
    }

    public int popHeadQueue(){
        if (isEmpty() == true){
            return -1;
        }

        return data[head];
    }

    public int popRearQueue(){
        if (isEmpty() == true){
            return -1;
        }

        return data[tail];
    }

    public boolean isEmpty(){
        return head == -1;
    }

    public boolean isFull(){
        //除开-1的所有相等的情况，都是队列已满的情况
        return ((tail + 1) % size) == head;
    }
}
