// Given two strings s and t, return true if the two strings 
// are anagrams of each other, otherwise return false.

// Input: s = "racecar", t = "carrace"

// Output: true

// Input: s = "jar", t = "jam"

// Output: false

import java.util.*;

public class NeetcodeValidAnagrams {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //Create a HashMap to count and store the characters from the string
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0)+ 1);
        }

        for(int i = 0; i<t.length(); i++){
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+ 1);
        }
        return countS.equals(countT);
    }

    public static void main(String[] args){
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t)); // Expected output: true

        s = "jar";
        t = "jams";
        System.out.println(isAnagram(s, t)); // Expected output: false
    }
}
