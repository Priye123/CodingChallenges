package codes;

import java.util.LinkedHashMap;
import java.util.Map;

@FunctionalInterface
interface Rahul {
    public int compress(char[] chars);
}

public class Practice1 {
    public static void main(String[] args) {
        Rahul r = chars -> {
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
        };
        System.out.println(r.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

}

//WAp to check whether number is even or odd using lambda expresions
//CheckNumber(n), n is a number
//even:- true, odd:-false
