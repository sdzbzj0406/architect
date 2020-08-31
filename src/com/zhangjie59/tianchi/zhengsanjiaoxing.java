package com.zhangjie59.tianchi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjie59
 * @date 2020/8/29 10:29 上午
 **/
public class zhengsanjiaoxing {

    public static int makeEquilateralTriangle(int[] lengths) {
        // write your code here.

        Arrays.sort(lengths);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<lengths.length; i ++) {
            if (map.containsKey(lengths[i])) {
                map.put(lengths[i], map.get(lengths[i]) + 1);
            } else {
                map.put(lengths[i], 1);
            }
        }
        int contain2 = 0;
        boolean contain2Flag = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 3) {
                return 0;
            }  else if (entry.getValue() == 2) {
                contain2 = entry.getKey();
                contain2Flag = true;
            }

            if (entry.getValue() > contain2 && contain2Flag) {
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        int[] len = {2,3,7,5};
        int i = makeEquilateralTriangle(len);
        System.out.println(i);
    }


}
