package ShuangZhiZheng;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * @author: Mr_liao
 * @create: 2022-07-10 14:49
 * @description: 反转字符串
 **/
public class test01 {
    public static void main(String[] args) {

    }

    static void reverseString(char[] s) {
        if (s.length <= 1){
            return;
        }

        int left = 0;
        int right = s.length - 1;
        char temp = ' ';
        while (left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right--;

        }
    }

    static void A(char[] s){
        if (s.length <= 1){
            return;
        }

        int left = 0;
        int right = s.length - 1;
        while(left < right){
            s[left] = (char)(s[left] ^ s[right]);
            s[right] = (char)(s[left]^s[right]);
            s[left] = (char)(s[left]^s[right]);
            left++;
            right--;
        }
    }
}
