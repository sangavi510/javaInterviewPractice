package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class StringClassd {

	public static void main(String[] args) {

		String s="abcacbsabcabcdcc";
		 // HashMap to store the last seen index of characters
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0;	 // Start of the current window
        int maxLen = 0; // Maximum length of substring
        String maxSubstr = ""; // Longest substring without repeating characters

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the substring (within the current window)
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                // Move the start pointer to the right of the last occurrence
                start = charIndexMap.get(currentChar) + 1;
            }

            // Update the last seen index of the current character
            charIndexMap.put(currentChar, end);

            // Update the longest substring if we find a new longest one
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxSubstr = s.substring(start, end + 1);
            }
        }
	 System.out.println(maxSubstr);
	
	}
}


