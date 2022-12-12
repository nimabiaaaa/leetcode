package DuiLie.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 14:39
 * @description:
 **/
public class SystemQueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();

        System.out.println("first is: "+q.peek());

        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);

        q.poll();

        System.out.println("first is: "+q.peek());

        System.out.println("The size is: " + q.size());
    }
}
