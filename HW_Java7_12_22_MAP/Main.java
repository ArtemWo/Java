package HW_Java.HW_Java7_12_22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
 /*    todo:  1. Write a Java method to count the number of words in a string
        xample: "as soon as possible" should return "as: 2, soon: 1, possible: 1"
        public void getWordsWithCount(String sentence) { }
        First level:  */
        String text = "as soon as possible";
        getWordsWithCount(text);
        //++++++++++++++++++++++++++++++++++++++++++++++++++++
  /*  todo; Second level:  Write a Java method to check if two strings are anagrams of each other or not
        public boolean checkStringsAnagram(String str1, String str2) {}
        First level:*/
        System.out.println(checkStringsAnagram("listen", "silent"));
        System.out.println(checkStringsAnagram("listen", "silint"));
    }

    //  First level:
    public static String getWordsWithCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        for (String word : words) {
          /*  if (hashMap.containsKey(words)) {
                int currenValue = hashMap.get(word);
                hashMap.put(word, hashMap.put(word, ++currenValue));
            } else {
                hashMap.put(word, 1);
            }*/
            hashMap.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);        //все что закоминторованно  можно заменить одной строкой
            System.out.println(hashMap);
        }
        return sentence;
    }



        //==================================================================
        // Second level
        public static boolean checkStringsAnagram(String word1, String word2) {
            if (word1.length() != word2.length()) {
                return false;
            }
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word1.length(); i++) {
                map.merge(word1.charAt(i), 1, Integer::sum);
                map.merge(word2.charAt(i), -1, Integer::sum);
            }
            for (Integer diff : map.values()) {
                if (diff != 0) {
                    return false;
                }
            }
            return true;
        }
}



