package DuiLie.openLock;

import java.util.*;

/**
 * @author: Mr_liao
 * @create: 2022-10-19 15:25
 * @description:
 **/
public class openLockCode {
    public static void main(String[] args) {

    }

    public int openLock(String[] deadends,String target){
        //死亡数字的数组转化为set集合
        Set<String> set = new HashSet<>(Arrays.asList(deadends));

        String startStr = "0000";

        if (set.contains(startStr)){
            return -1;
        }

        Queue<String> queue = new LinkedList<>();

        Set<String> vist = new HashSet<>();
        queue.offer(startStr);
        vist.add(startStr);

        int level = 0;

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String str = queue.poll();

                for (int j = 0; j < 4; j++) {
                    char ch = str.charAt(j);

                    String strAdd = str.substring(0,j) + (ch == '9'?0 : ch - '0' + 1) + str.substring(j+1);
                    String strSub = str.substring(0,j) + (ch == '0'?9 : ch - '0' - 1) + str.substring(j+1);

                    if (str.equals(target)){
                        return level;
                    }

                    if (!set.contains(strAdd) && !vist.contains(strAdd)){
                        queue.offer(strAdd);
                        vist.add(strAdd);
                    }

                    if (!set.contains(strSub) && !vist.contains(strSub)){
                        queue.offer(strSub);
                        vist.add(strSub);
                    }
                }
            }

            level++;
        }

        return -1;
    }

    public int openLock2(String[] deadends,String target){
        Set<String> setStr = new HashSet<>(Arrays.asList(deadends));

        String startStr = "0000";

        if (setStr.contains(startStr)){
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> vist = new HashSet<>();

        int level = 0;
        queue.offer(startStr);
        vist.add(startStr);

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String str = queue.poll();

                for (int j = 0; j < 4; j++) {
                    char ch = str.charAt(j);

                    String strAdd = str.substring(0,j) + (ch == '9'?0:ch - '0' +1) + str.substring(j+1);
                    String strSub = str.substring(0,j) + (ch == '0'?9:ch - '0' -1) + str.substring(j+1);

                    if (str.equals(target)){
                        return level;
                    }

                    if (!setStr.contains(strAdd) && !vist.contains(strAdd)){
                        queue.offer(strAdd);
                        vist.add(strAdd);
                    }

                    if (!setStr.contains(strSub) && !vist.contains(strSub)){
                        queue.offer(strSub);
                        vist.add(strSub);
                    }
                }
            }

            level++;
        }

        return -1;
    }
}
