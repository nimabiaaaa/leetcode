package DuiLie.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 10:48
 * @description:
 **/
public class QueueTest2 {
    public static void main(String[] args) {
        MyQueue2 p = new MyQueue2();

        p.addQueue(5);
        p.addQueue(3);

        if (p.isEmpty() == false){
            System.out.println(p.popQueue());
        }

        p.deleteQueue();

        if (p.isEmpty() == false){
            System.out.println(p.popQueue());
        }

        p.deleteQueue();

        if (p.isEmpty() == true){
            System.out.println("队列为空");
        }
    }
}
