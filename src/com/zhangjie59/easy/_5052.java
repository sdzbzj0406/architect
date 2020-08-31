package com.zhangjie59.easy;

import java.util.Queue;

public class _5052 {
    // 计算二叉树的每层的和，层次遍历，设计两个队列，下一层放到新的列

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxLevelSum(TreeNode root) {


        Queue<Integer> queue = null;
        Queue<Integer> nextQueue;

        if (root == null){
            return 0;
        }else {
            queue.add(root.val);
        }

        while (queue.size()!=0){
            int sum = 0;
            for (Integer i:queue){
                sum += i;
            }

        }
        return 0;





    }
}
