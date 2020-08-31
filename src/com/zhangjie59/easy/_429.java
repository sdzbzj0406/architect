package com.zhangjie59.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();


        Queue<Node> parent_queue = new LinkedList<>();
        Queue<Node> child_queue = new LinkedList<>();

        List<Integer> res = new ArrayList<>();

        parent_queue.add(root);

        while (parent_queue.size()>0){
            Node parent = parent_queue.poll();
            child_queue.addAll(parent.children);

            res.add(parent.val);

            if(parent_queue.size()==0) {
                list.add(res);
                res = new ArrayList<>();
                while (child_queue.size()>0){
                    Node child = child_queue.poll();
                    parent_queue.add(child);
                }
                child_queue = new LinkedList<>();
            }
        }
        return list;
    }

}

