package Stacks.MyQueueCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author: Mr_liao
 * @create: 2022-10-30 19:29
 * @description:
 **/
public class MyQueue {

    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public MyQueue(){
        stack1 = new LinkedList<>();
    }
}
