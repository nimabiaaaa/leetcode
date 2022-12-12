package Stacks.MinStackCode;

/**
 * @author: Mr_liao
 * @create: 2022-10-21 14:43
 * @description:
 **/
public class ListNode {
    public int val;
    public int min;
    public ListNode next;

    public ListNode(int val, int min, ListNode next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
