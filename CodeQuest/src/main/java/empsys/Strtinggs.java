package empsys;

import java.util.HashSet;
import java.util.Set;

public class Strtinggs {

	public int lengthOfLongestSubstring(String s) {
	    int n = s.length();
	    Set<Character> set = new HashSet<>();
	    int maxLength = 0, left = 0, right = 0;

	    while (right < n) {
	        if (!set.contains(s.charAt(right))) {
	            set.add(s.charAt(right));
	            right++;
	            maxLength = Math.max(maxLength, right - left);
	        } else {
	            set.remove(s.charAt(left));
	            left++;
	        }
	    }

	    return maxLength;
	}


}
