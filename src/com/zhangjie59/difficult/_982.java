package com.zhangjie59.difficult;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/triples-with-bitwise-and-equal-to-zero/comments/
 *
 * 三个数相与值为0，先将任意两个数的与的结果存在map中---< 与的结果，出现次数 >,
 * 最后遍历key与数组中的值进行与运算结果为0，则累加出现次数即可。
 *
 */
public class _982 {
    public int countTriplets(int[] A) {
        if(A.length<=0){
            return 0;
        }
        int length = A.length;
        int total = 0;
        Map<Integer,Integer> map = new HashMap<>(length);

        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                int sum = A[i] & A[j];
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else{
                    map.put(sum,1);
                }
            }
        }

        for (Map.Entry key:map.entrySet()){
            for(int i =0;i<length;i++){
                int a = (int)key.getKey();
                if((a & A[i]) ==0){
                    total = total + (int)key.getValue();
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] A = {2,1,3};
        _982 c = new _982();
        int result = c.countTriplets(A);
        System.out.println(result);
    }
}
