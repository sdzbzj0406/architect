package com.zhangjie59.easy;

import java.util.HashMap;
import java.util.Map;

public class _5048 {
    // 深拷贝，浅拷贝
    // hashmap key相同，处理方法

    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for (String word : words){

            Map<Character,Integer> mapTemplate = new HashMap<>();
            for (int i=0; i<chars.length(); i++){
                char c = chars.charAt(i);
                if(mapTemplate.containsKey(c)){
                    mapTemplate.put(c,mapTemplate.get(c)+1);
                }else {
                    mapTemplate.put(c,1);
                }
            }

            boolean flag = true;

            for (Character character : word.toCharArray()){
                if (mapTemplate.containsKey(character) && mapTemplate.get(character) != 0){
                    mapTemplate.put(character,mapTemplate.get(character)-1);
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                count += word.length();
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";


        _5048 a = new _5048();
        int result = a.countCharacters(words, chars);
        System.out.println(result);
    }
}
