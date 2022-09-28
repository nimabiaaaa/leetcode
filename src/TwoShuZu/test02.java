package TwoShuZu;

/**
 * @author: Mr_liao
 * @create: 2022-06-27 23:18
 * @description: 零矩阵
 **/
public class test02 {
    public static void main(String[] args) {

    }

    /**
     * 每次找到等于零的那一个把对应的行和列都置零即可，但是会出现一个问题就是到最后所有的元素都变成零了；
     * 因此，既然打算将整行和整列清零，因此并不需要标记录它是cell[2][4]（行2，列4），只需要知道行2有个元素为0，列4有个元素为0.不管怎样，整行和整列都要清零，又何必要记录零元素的确切位置？
     *
     * 作者：DonYong
     * 链接：https://leetcode.cn/leetbook/read/array-and-string/ciekh/?discussion=JGA6Zo
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param matrix
     */
    static void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] colum = new boolean[matrix[0].length];
        //遍历数组，找出0元素所在行列位置，
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    //记录0所在位置的行数和列数，将临时的布尔数组全赋值为true,
                    // 对应意思是将0所在行和列都置位true
                    row[i] = true;
                    colum[j] = true;
                }
            }
        }
        //再次遍历数组，找出所在行列位置都对应为true的位置
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || colum[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
