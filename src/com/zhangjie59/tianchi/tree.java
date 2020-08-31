package com.zhangjie59.tianchi;

/**
 * @author zhangjie59
 * @date 2020/8/29 10:12 上午
 **/
public class tree {

    public static int treePlanning(int[] trees, int d) {
        // write your code here.

        int[] cha = new int[trees.length - 1];
        for (int i = 1; i < trees.length; i++) {
            cha[i - 1] = trees[i] - trees[i - 1];
        }

        int count = 0;
        int temp = 0;
        for (int value : cha) {
            temp += value;
            if (temp >= d) {
                count++;
                temp = 0;
            }
        }

        return trees.length - (count + 1);

    }

    public static void main(String[] args) {
        int[] trees = {1,2,3,5,6};
        int d = 2;
        int a = treePlanning(trees, d);
        System.out.println(a);
    }
}
