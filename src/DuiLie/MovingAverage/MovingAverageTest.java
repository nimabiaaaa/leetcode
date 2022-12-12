package DuiLie.MovingAverage;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 15:49
 * @description:
 **/
public class MovingAverageTest {
    public static void main(String[] args) {
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1));
        System.out.println(m.next(10));
        System.out.println(m.next(3));
        System.out.println(m.next(5));
    }
}
