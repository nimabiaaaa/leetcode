package ZiFuChuan;

/**
 * @author: Mr_liao
 * @create: 2022-06-30 07:33
 * @description: 最长公共前缀
 **/
public class test01 {
    public static void main(String[] args) {
        String s1 = "dog";
        System.out.println(s1.substring(0,0));
        System.out.println("");
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null){
            return "";
        }

        int n = strs.length;
        //将第一个字符串成员作为初始对照
        String pre = strs[0];
        for (int i = 1; i < n; i++) {
            //依次比较两个字符串每个字符
            pre = compar(pre,strs[i]);
            if (pre.length() == 0){
                return pre;
            }
        }
        return pre;
    }
    //返回两个字符串的公共部分
    static String compar(String s1,String s2){
        //取长度最小的那个字符串的长度
        int n = Math.min(s1.length(),s2.length());

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                break;
            }
            index++;
        }

        return s1.substring(0,index);
    }

    static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0 || strs == null){
            return "";
        }

        int index = 0;
        int n = strs.length;
        //将第一个元素作为初始对照
        String pre = strs[0];

        for (int i = 1; i < n; i++) {
            pre = compare(pre,strs[i]);
            //如果返回的字符串长度为0，说明两个字符串完全不相同，直接返回结果，也就是 ""
            if (pre.length() == 0){
                return pre;
            }
        }

        return pre;
    }

    static String compare(String s1,String s2){
        int n = Math.min(s1.length(),s2.length());
        //记录两个字符串相同字符位数的下标
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                break;
            }
            index++;
        }
        return s1.substring(0,index);
    }
}
