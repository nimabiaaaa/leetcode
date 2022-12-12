package Stacks.dailyTemperaturesCode;

import java.util.Stack;

/**
 * @author: Mr_liao
 * @create: 2022-10-24 09:39
 * @description:
 **/
public class dailyTemperatures {
    public static void main(String[] args) {

    }

    /**
     * 暴力法
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;

        int[] res = new int[length];

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (temperatures[j] > temperatures[i]){
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }

    public int[] dailyTemperatures2(int[] T) {
        Stack<Integer> stack = new Stack<>();

        int[] res = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]){
                int idx = stack.pop();
                res[idx] = i - idx;
            }

            stack.push(i);
        }

        return res;
    }
}
