package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//输出字符串中重复的字符
public class FindDuplicateCharacters {

    public static void main(String[] args) {
        duplicateCharacters("Programming");
        duplicateCharacters("Combination");
        duplicateCharacters("Java");
    }

    public static void duplicateCharacters(String str) {
        char[] chars = str.toCharArray();

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (Character c : chars) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }

        Set<Map.Entry<Character,Integer>> set = map.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", str);
        for (Map.Entry<Character, Integer> entry : set) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
