package codes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        a1();
    }

    private static void a1() {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
//        String s="10";
//        System.out.println(s.length());
    }

    public static int compress(char[] chars){
        Map<Character, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], (char) (map.get(chars[i]) + '1'));
            } else {
                map.put(chars[i], '1');
            }
        }
        System.out.println(map);
        int count = 0;
        for (char c : map.keySet()) {
            int value = map.get(c);
            if (value > 1) {
                count = count + Integer.toString(value).length();
            }
            count++;
        }

        return count;
    }
}
