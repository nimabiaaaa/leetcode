package Shuzu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Mr_liao
 * @create: 2022-06-26 12:56
 * @description: 键盘输入数据参考案例
 **/
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----");
        //用nextline方式接收str——将换行符(/n、Enter键)作为结束符
        /*String s1 = sc.nextLine();
        System.out.println("1---: "+s1);*/
        //next方式接收str——将空格键作为结束符
        /*String s2 = sc.next();
        System.out.println("2---: "+s2);*/
        //接收int值
        /*int a = sc.nextInt();
        System.out.println(a);*/
        //接受二进制值
        /*byte b = sc.nextByte();
        System.out.println(b);*/
        //接受布尔值
        /*boolean b1 = sc.nextBoolean();
        System.out.println(b1);*/

        //接受浮点数
        /*float v = sc.nextFloat();
        System.out.println(v);*/

        //接受字符
        /*char c = sc.next().charAt(0);
        System.out.println(c);*/

        //java键盘输入一个数组并打印
       /* int length = sc.nextInt();

        int[] a1 = new int[length];
        for (int i = 0; i < length; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a1));*/

        //键盘输入一个字符串
        /*String s1 = sc.next().toString();
        System.out.println(s1);

        String[] arr = s1.split(",");

        for (String s:arr){
            System.out.print(s+" ");
        }*/

        //不指定数组大小，用字符串作为中介
        String s1 = sc.nextLine();
        String[] arr = s1.split(" ");
        int[] a2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            a2[i] = Integer.parseInt(arr[i]);
        }

        for (int a3:a2){
            System.out.print(a3+" ");
        }
        sc.close();

    }
}
