package com.stringAnagrams;

import org.junit.Test;

//判断两个字符串是否互为anagram
public class StringAnagramTest {

    @Test
    public void testIsAnagram() {
        System.out.println("first================");
        System.out.println(AnagramCheck.isAnagram("word", "wrdo"));
        System.out.println(AnagramCheck.isAnagram("mary", "army"));
        System.out.println(AnagramCheck.isAnagram("stop", "tops"));
        System.out.println(AnagramCheck.isAnagram("boat", "btoa"));
        System.out.println(AnagramCheck.isAnagram("pure", "in"));
        System.out.println(AnagramCheck.isAnagram("fill", "fil"));
        System.out.println(AnagramCheck.isAnagram("b", "bbb"));
        System.out.println(AnagramCheck.isAnagram("ccc", "ccccccc"));
        System.out.println(AnagramCheck.isAnagram("a", "a"));
        System.out.println(AnagramCheck.isAnagram("sleep", "slep"));
    }

    @Test
    public void testIAnagram() {
        System.out.println("second======================");
        System.out.println(AnagramCheck.iAnagram("word", "wrdo"));
        System.out.println(AnagramCheck.iAnagram("boat", "btoa"));
        System.out.println(AnagramCheck.iAnagram("pure", "in"));
        System.out.println(AnagramCheck.iAnagram("fill", "fil"));
        System.out.println(AnagramCheck.iAnagram("a", "a"));
        System.out.println(AnagramCheck.iAnagram("b", "bbb"));
        System.out.println(AnagramCheck.iAnagram("ccc", "ccccccc"));
        System.out.println(AnagramCheck.iAnagram("sleep", "slep"));
    }

    @Test
    public void testcheckAnagram() {
        System.out.println("third==================");
        System.out.println(AnagramCheck.checkAnagram("word", "wrdo"));
        System.out.println(AnagramCheck.checkAnagram("b", "bbb"));
        System.out.println(AnagramCheck.checkAnagram("ccc", "ccccccc"));
        System.out.println(AnagramCheck.checkAnagram("a", "a"));
        System.out.println(AnagramCheck.checkAnagram("sleep", "slep"));
        System.out.println(AnagramCheck.checkAnagram("boat", "btoa"));
        System.out.println(AnagramCheck.checkAnagram("pure", "in"));
        System.out.println(AnagramCheck.checkAnagram("fill", "fil"));
    }

}
