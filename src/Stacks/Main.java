package Stacks;

/**
 * @author: Mr_liao
 * @create: 2022-10-19 17:22
 * @description:
 **/
public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (int i = 0; i < 4; i++) {
            if (!stack.isEmpty()){
                System.out.println(stack.top());
            }

            System.out.println(stack.pop());
        }
    }
}
