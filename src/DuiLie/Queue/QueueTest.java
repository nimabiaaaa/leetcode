package DuiLie.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 10:31
 * @description:
 **/
public class QueueTest {
    public static void main(String[] args) {
        MyQueue q =new MyQueue();
        q.enQueue(5);
        q.enQueue(3);

        if (q.isEmpty() == false){
            System.out.println(q.Front());
        }

        q.deQueue();

        if (q.isEmpty() == false){
            System.out.println(q.Front());
        }

        q.deQueue();

        if (q.isEmpty() == false){
            System.out.println(q.Front());
        }

        if(q.isEmpty() == true){
            System.out.println("队列为空");
        }
    }
}
