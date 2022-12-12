package Stacks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-10-19 17:16
 * @description: 基本栈的实体定义
 **/
public class MyStack {

    private List<Integer> data;

    public MyStack(){
        data = new ArrayList<>();
    }

    /**
     * 入栈
     * @param x
     */
    public void push(int x){
        data.add(x);
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return data.isEmpty();
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public int top(){
        return data.get(data.size() - 1);
    }

    public boolean pop(){
        if (isEmpty()){
            return false;
        }

        data.remove(data.size() - 1);
        return true;
    }
}
