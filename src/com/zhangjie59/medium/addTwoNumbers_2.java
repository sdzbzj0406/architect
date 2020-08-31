package com.zhangjie59.medium;

import java.util.Stack;

/**
 * @author zhangjie59
 * @desc https://leetcode-cn.com/problems/add-two-numbers/
 * @create 2020-03-23 23:17
 **/


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class addTwoNumbers_2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode temp = head;

        boolean plus = false;
        while (l1 != null) {
            int a = l1.val;

            int b = 0;
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            int val = a+b;

            if (plus) {
                val = val + 1;
                plus = false;
            }

            if (val > 10) {
                val = val - 10;
                plus = true;
            }

            ListNode listNode = new ListNode(val);

            temp.next = listNode;
            temp = listNode;
            l1 = l1.next;

        }

        while (l2 != null) {
            int val = l2.val;
            if (plus) {
                val = val + 1;
                plus = false;
            }

            if (val > 10) {
                plus = true;
                val = val - 10;
            }

            ListNode listNode = new ListNode(val);
            temp.next = listNode;
            temp = listNode;
            l2 = l2.next;

        }

        return head.next;



    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode a2 = new ListNode(4);
        a.next = a2;
        ListNode a3 = new ListNode(3);
        a2.next = a3;



        ListNode b = new ListNode(5);
        ListNode b2 = new ListNode(6);
        b.next = b2;
        ListNode b3 = new ListNode(4);
        b2.next = b3;

        addTwoNumbers_2 addTwoNumbers_2 = new addTwoNumbers_2();
        addTwoNumbers_2.addTwoNumbers(a,b);
    }

}

