package com.zhangjie59.difficult;

public class _828 {
    static class Solution {
        public int uniqueLetterString(String S) {
            int sum = 0;

            char[] ch = S.toCharArray();

            int index = 0;
            while (index < ch.length){
                sum += getCountChar(ch,index);
                index++;
            }

            return sum;
        }
        //得出每个位置的字符想成为唯一字符的个数
        public int getCountChar(char[] ch, int index){
            int loc = index;
            if (ch == null) {
                return 0;
            }
            if (index < 0||index >= ch.length){
                return 0;
            }

            int left = 1;
            int right = 1;

            while (loc >= 0) {

                if(loc == 0){
                    break;
                }

                if(ch[loc-1] != ch[index] ){
                    left++;
                    loc --;
                }else {
                    break;
                }
            }

            loc = index;

            while (loc < ch.length){
                if(loc == ch.length-1){
                    break;
                }
                if (ch[loc+1] != ch[index]){
                    right++;
                    loc++;
                }else {
                    break;
                }
            }

            return left * right;

        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int sum = s.uniqueLetterString("ABA");
        System.out.println(sum);
    }
}
