package Stacks.MinStackCode;

/**
 * @author: Mr_liao
 * @create: 2022-10-21 14:57
 * @description:
 **/
public class MinStack {

    private ListNode head;

    /**
     * 压栈
     * @param x
     */
    public void push(int x){
        if (empty()){
            head = new ListNode(x,x,null);
        }else {
            head = new ListNode(x,Math.min(x,head.min),head);
        }
    }

    /**
     * 出栈
     */
    public void pop(){
        if (empty()){
            throw new IllegalStateException("栈为空...");
        }
        head = head.next;
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public int top(){
        if (empty()){
            throw new IllegalStateException("栈为空..");
        }
        return head.val;
    }

    /**
     * 链表中头结点保存的是整个链表最小的值，所以返回head.min也就是
     * 返回栈中最小的值
     * @return
     */
    public int getMin(){
        if (empty()){
            throw new IllegalStateException("栈为空...");
        }
        return head.min;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    private boolean empty() {
        return head == null;
    }
}
