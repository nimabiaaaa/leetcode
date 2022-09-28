package ZiFuChuan;

import java.util.Scanner;

/**
 * @author: Mr_liao
 * @create: 2022-07-04 22:59
 * @description: 最长回文子串
 **/
public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){

            String s = sc.nextLine();
            if (s.trim() == "1"){
                flag = false;
            }
            String s1 = longestPalindrome(s);
            System.out.println(s1);
        }
        sc.close();
    }


    static String longestPalindrome(String s) {
        //当字符串为空或者长度小于2的时候，他一定为回文子串，且是其本身
        if (s == null || s.length() < 2){
            return s;
        }

        //根据中心扩展法，从某个元素开始，
        //左右探索是否回文数并返回回文数的长度,比较并保存最长起始坐标和长度;
        //注意:回文数奇偶情况
        //最长回文数的起始坐标
        int idx=0;
        //最开始判断了长度小于2的情况，所以此处初始长度值定为1
        int len=1;
        //从第一个元素开始，进行左右判断，遍历到倒数第二个元素截至，因为分奇偶情况
        for (int i = 0; i < s.length() - 1; i++) {
            //1 获取奇数情况的最长回文长度，奇数情况，
            // 只需要以当前元素为基准，再去左右寻找即可
            int len1 = longestLen(s,i,i);

            //2 获取偶数情况的最长回文长度
            int len2 = longestLen(s,i,i+1);

            //3 先对奇数情况进行校验
            if (len1 > len){
                len = len1;
                idx = i - len/2;
            }

            //4 再对偶数情况进行校验
            if (len2 > len){
                len = len2;
                idx = i - (len/2 - 1);
            }
        }

        return s.substring(idx,idx+len);
    }

    //左右探索最长回文子串长度
    static int longestLen(String s, int left, int right) {
        while (left >=0 && right < s.length()){
            if (s.charAt(left) != s.charAt(right)){
                break;
            }
            left--;
            right++;
        }

        return right - left - 1;
    }

    static String A(String s){
        if (s == null || s.length() < 2) return s;

        //最长回文串的起始索引
        int idx = 0;
        //最长回文串的最小长度，因为上面讨论过小于2的情况，所以，此处初始值为1
        int len = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            //当为奇数情况
            int len1 = B(s,i,i);

            //当为偶数情况
            int len2 = B(s,i,i+1);

            //判断奇数情况下的最长长度
            if (len1 > len){
                len = len1;
                idx = i - len/2;
            }

            //判断偶数情况下的最长长度
            if (len1 > len){
                len = len2;
                idx = i - (len/2 - 1);
            }
        }

        return s.substring(idx,idx + len);
    }
    //从中间向两边遍历，寻找最长回文串，返回其长度
    //分为奇偶情况
    static int B(String s,int L,int R){
        while (L >=0 && R < s.length()){
            if (s.charAt(L) != s.charAt(R)){
                break;
            }

            L--;
            R++;
        }

        return R - L - 1;
    }
}
