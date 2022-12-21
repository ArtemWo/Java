package HW_Java.HW_Java7_12_22;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
 /*    todo:  1. Write a Java method to count the number of words in a string
        xample: "as soon as possible" should return "as: 2, soon: 1, possible: 1"
        public void getWordsWithCount(String sentence) { }
        First level:  */
        Main obj = new Main();
        String sentence = null;
        System.out.println(obj.getWordsWithCount(sentence));
        //++++++++++++++++++++++++++++++++++++++++++++++++++++
  /*  todo; Second level:  Write a Java method to check if two strings are anagrams of each other or not
        public boolean checkStringsAnagram(String str1, String str2) {}
        First level:*/
        String str1 = "caption";
        String str2 = "Pantiac";
        System.out.println(checkStringsAnagram(str1,str2));
    }

    //  First level:
    public static String getWordsWithCount(String sentence) {
        String text = "as soon as possible";
        String[] words = text.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        for (String i : words) {
            if (hashMap.containsKey(i))
                hashMap.put(i, hashMap.get(i) + 1);
            else
                hashMap.put(i, 1);
        }
        return hashMap.toString();
    }

    //==================================================================
    // Second level
    public static boolean checkStringsAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<String, Integer> chekAnagram = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char word1 = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char word2 = str2.charAt(j);
                if (word1 != word2) {
                }
            }
        }
        return chekAnagram.isEmpty();
        
    }
}


