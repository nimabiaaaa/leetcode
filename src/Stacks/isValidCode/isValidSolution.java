package Stacks.isValidCode;

import java.util.Stack;

/**
 * @author: Mr_liao
 * @create: 2022-10-21 16:43
 * @description:
 **/
public class isValidSolution {
    public static void main(String[] args) {

    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c:chars){
            if (c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
