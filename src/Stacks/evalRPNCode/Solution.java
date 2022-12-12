package Stacks.evalRPNCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: Mr_liao
 * @create: 2022-10-26 17:18
 * @description: 逆波兰表达式求值
 **/
public class Solution {
    public static void main(String[] args) {

    }

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();

        for (String token:tokens){
            if (token.equals("+")){
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                stack.push(num1 + num2);
            }else if (token.equals("-")){
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                stack.push(num2 - num1);
            }else if (token.equals("*")){
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                stack.push(num1 * num2);
            }else if (token.equals("/")){
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                stack.push(num2 / num1);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
