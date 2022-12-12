package Stacks.MinStackCode;

import java.util.Stack;

/**
 * @author: Mr_liao
 * @create: 2022-10-21 15:25
 * @description:
 **/
public class MinStack2 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /**
     * 压栈
     * @param val
     */
    public void push(int val){
        stack1.push(val);
        if (stack2.isEmpty() || val <= getMin()){
            stack2.push(val);
        }
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public int top(){
        return stack1.peek();
    }

    public void pop(){
        //如果出栈的值等于最小值，说明栈中的最小值
        //已经出栈了，因为stack2中的栈顶元素存放的
        //就是最小值，所以stack2栈顶元素也要出栈
        if (stack1.pop() == getMin()){
            stack2.pop();
        }
    }

    public int getMin() {
        return stack2.peek();
    }
}
