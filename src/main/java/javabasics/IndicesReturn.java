package javabasics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IndicesReturn {
    public static void main(String[] args) {
        // int a[] = new int[2];

//brute-force approach
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    a[0] = i;
//                    a[1] = j;
//                    break;
//                }
//            }
//        }


//naive approach
        int nums[] = {2, 7, 9, 11}, target = 9;
        int a[] = new int[2];
        Map<Integer, Integer> map = new LinkedHashMap<>();

        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int j = nums[i];
            int key = target - j;
            if (map.containsKey(key)) {
                a[0] = map.get(key);
                a[1] = i;
                break;
            }
            map.put(nums[i], i);
        }


        for (int x : a)
            System.out.print(x + " ");
    }
}
