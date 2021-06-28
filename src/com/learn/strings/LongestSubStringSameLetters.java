package com.learn.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringSameLetters {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str = "aabccbb";
	int k = 2;
	int windowStart = 0, maxLength = 0, maxRepeatLetterCount = 0;;
	    Map<Character, Integer> charFrequencyMap = new HashMap<>();
	    // in the following loop we'll try to extend the range [windowStart, windowEnd]
	    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
	      char rightChar = str.charAt(windowEnd);
	      charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
	      maxRepeatLetterCount = Math.max(maxRepeatLetterCount, charFrequencyMap.get(rightChar));
	      // shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
	     if(windowEnd - windowStart +1 -maxRepeatLetterCount > k) {
	        char leftChar = str.charAt(windowStart);
	        charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
	        windowStart++; // shrink the window
	      }
	      maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
	    }
	    System.out.println(maxLength);
    }

}
