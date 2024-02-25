package codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        Set<Character> set = new LinkedHashSet<>();
        int maxLength = 0, counter = 0;

        for (int i = 0; i < s.length(); ) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                i++;
            } else {
                if (maxLength < set.size()) {
                    maxLength = set.size();
                }
                set.clear();
                counter++;
                i = counter;
            }
        }
        System.out.println(maxLength);

    }
}
