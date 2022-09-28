package TwoShuZu;

/**
 * @author: Mr_liao
 * @create: 2022-06-26 22:51
 * @description: 旋转矩阵
 **/
public class test01 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


    }

    static void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length){
            return;
        }
        //行数
        int nums = matrix.length;
        //层数,从0开始，从外层到内层
        int times = 0;
        //层数不超过nums/2,nums >> 1 等价于nums/2
        //遍历层数
        while (times <= nums >> 1){
            //每层的边长= 行数 - 层数*2
            int len = nums - (times << 1);
            //将每层，按顺时针分为4份len−1 的边，对四条边进行元素的循环交换即可。
            for (int i = 0; i < len - 1; i++) {
                int temp = matrix[times][times + i];
                matrix[times][times + i] = matrix[times + len -i - 1][times];
                matrix[times + len -i - 1][times] = matrix[times + len - 1][times + len -i - 1];
                matrix[times + len - 1][times + len -i - 1] = matrix[times + i][times + len - 1];
                matrix[times + i][times + len - 1] = temp;
            }
            //一层循环结束，往内继续下一层
            ++times;
        }
    }

    //先以左上-右下对角条线为轴做翻转，再以中心的竖线为轴做翻转，就可以翻转90度。
    static void rotate2(int[][] matrix) {
        //获取行长
        int n = matrix.length;
        
        //1 以左上-右下对角线为轴做翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //再沿着垂直竖线翻转
        for (int i = 0; i < n; i++) {
            //类似于双指针，从第一行开始，每行由两端向中间靠齐
            for (int j = 0,k = n-1; j < k;k--, j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }
}
