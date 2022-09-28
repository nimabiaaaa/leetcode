package TwoShuZu;

/**
 * @author: Mr_liao
 * @create: 2022-06-28 22:34
 * @description:
 **/
public class test03 {
    public static void main(String[] args) {

    }

    static int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) {
            return new int[0];
        }
        //行数
        int m = mat.length;
        //列数
        int n = mat[0].length;
        //存放数组
        int[] ans = new int[m * n];
        //数组索引
        int index = 0;
        //总对角线线条数
        int k = n+m-1;
        //行列起始下标
        int row=0,col=0;

        //对角线遍历
        for (int i = 0; i < k; i++) {
            //判断对角线方向
            //画图可知，向上为偶数，向下为奇数
            if (i%2 == 0){
                //右上
                while (row >=0 && col <n){
                    ans[index] = mat[row][col];
                    index++;
                    row--;
                    col++;
                }

                //判断是否越界，画图分析可知，向上越界，行比列先越界
                //1 列未越界，行越界，只会向上越界一位，因此行回退一位即可回到下一个对角线起点
                if (col < n){
                    row++;
                }else {
                    //当向上越界，当列越界时候，那就是行列都越界，
                    // 此时行需要回退两位，列回退1位即可回到下一个对角线起点
                    row += 2;
                    col--;
                }
            }else {
                //向下为奇数
                //左下
                while (col >=0 && row <m){
                    ans[index] = mat[row][col];
                    index++;
                    row++;
                    col--;
                }

                //判断是否越界，画图分析可知，向下越界，列比行先越界
                //1 行未越界，列越界，只会向下越界一位，因此列回退一位即可回到下一个对角线起点
                if (row < m){
                    col++;
                }else {
                    //2 行越界，那必然列也越界了，
                    //此时列需要回退2位，行回退一位，才可以回到下一个对角线起点
                    col += 2;
                    row--;
                }
            }
        }
        return ans;
    }
}