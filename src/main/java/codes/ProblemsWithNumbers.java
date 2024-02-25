package codes;

import java.util.*;

public class ProblemsWithNumbers {
    public static void main(String[] args) {
        //a1();
        //a2();
        //a3();
        //a4();
        //a5();
        //a6();
        //a7();
        //a8();
//        TUSPOH
//        STRONG
//        char c1='d';
//        char c2= (char) (c1+1);
//        System.out.println(c2);

//        Scanner in = new Scanner(System.in);
//        String A = in.nextLine();
//        String B = in.nextLine();
//
//        for (int i = 0; i < A.length(); i++) {
//            char ch1 = A.charAt(i);//T
//            char ch2 = B.charAt(i);//S
//            if ((char) (ch2 + 1) != ch1) {
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println(true);
        a9();


    }

    private static void a9() {
        int a[] = {1, 2, 4, 3, 1, 5};
        int b[] = {9, 2, 3};
        int c[] = {6, 2, 1, 10};

        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int flag = 0;
        //a-1,2,4,3,5
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                flag = 1;
                set1.add(b[i]);//{3}
            }
        }
        if (flag == 0) {
            System.out.println("no common elements");
            return;
        }
        flag = 0;
        set.clear();
        for (int i = 0; i < c.length; i++) {
            if (set1.contains(c[i])) {
                flag = 1;
                set.add(c[i]);//{1,3}
            }
        }
        if (flag == 0) {
            System.out.println("no common elements");
        } else {
            System.out.println(set);
        }

    }

    private static void a8() {
        System.out.println(findMinimumOperations("dac", "dae", "daf"));
    }

    public static int findMinimumOperations(String s1, String s2, String s3) {
        //int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        String target = "";
        if (s1.length() <= s2.length() && s1.length() <= s3.length()) {
            target = s1;
        } else if (s2.length() <= s3.length() && s2.length() <= s1.length()) {
            target = s2;
        } else {
            target = s3;
        }
        //StringBuilder sb = new StringBuilder(target);
        int ops = 0;
        if (target.equals(s1)) {
            ops = returnOps(target, s2, s3);
        } else if (target.equals(s2)) {
            ops = returnOps(target, s1, s3);
        } else {
            ops = returnOps(target, s1, s2);
        }
        return ops;
    }

    private static int returnOps(String target, String s1, String s2) {
        int ops = 0;
        int j = s1.length() - 1;
        StringBuilder sb = new StringBuilder(s1);
        while (!sb.toString().equals(target) && j != 0) {
            sb.deleteCharAt(j);
            j--;
            ops++;
        }
        if (j == 0) {
            return 0;
        }
        j = s2.length() - 1;
        sb = new StringBuilder(s2);
        while (!sb.toString().equals(target) && j != 0) {
            sb.deleteCharAt(j);
            j--;
            ops++;
        }
        return ops;
    }

    static void a7() {
        int num = 1994;
        String ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String ths[] = {"", "M", "MM", "MMM"};

        System.out.println(ths[num / 1000] + hds[(num / 100) % 10] + tens[(num / 10) % 10] + ones[num % 10]);
    }

    private static void a6() {
        System.out.println(myAtoi("   -42"));
    }

    public static int myAtoi(String s) {
        String t = "";
        char ch = s.charAt(0);
        if (!Character.isDigit(ch) && ch != ' ' && (ch != '-' || ch != '+')) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
//            if (ch != ' ' && Character.isDigit(ch)) {
//                t = t + ch;
//            }
            if (ch == ' ')
                continue;
            if (ch == '-' || ch == '+') {
                t = t + ch;
                continue;
            }
            if (Character.isDigit(ch))
                t = t + ch;
        }
        int x = Integer.parseInt(t);
        return 0;
    }

    private static void a5() {
        int x = 20;
        String z = Integer.toString(x);
        if (z.length() >= Math.pow(-2, 31) && z.length() <= Math.pow(2, 31)) {
            String t = "";
            if (z.charAt(0) == '-') {
                StringBuilder sb = new StringBuilder(z.substring(1)).reverse();
                t = t + z.charAt(0) + sb;
            } else {
                StringBuilder sb = new StringBuilder(z).reverse();
                t = t + sb;
            }
            System.out.println(Integer.parseInt(t));
        }

//        String s="120";
//        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }

    private static void a4() {
        int nums1[] = {1, 3};
        int nums2[] = {2};
        System.out.printf("%.5f", findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArray[] = new int[nums1.length + nums2.length];
        int i = 0, j = 0, count = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[count] = nums1[i];
                i++;
                count++;
            } else {
                mergedArray[count] = nums2[j];
                j++;
                count++;
            }
        }
        while (i != nums1.length) {
            mergedArray[count] = nums1[i];
            i++;
            count++;
        }
        while (j != nums2.length) {
            mergedArray[count] = nums2[j];
            j++;
            count++;
        }
        for (int x : mergedArray) {
            System.out.print(x + " ");
        }
//        if(mergedArray.length%2!=0){
//            return mergedArray[mergedArray.length/2];
//        }else {
        return (mergedArray.length % 2 != 0) ? mergedArray[mergedArray.length / 2] : (double) (mergedArray[(mergedArray.length / 2) - 1] + mergedArray[mergedArray.length / 2]) / 2;
//        }
//        return 0;
    }

    private static void a3() {
        System.out.println(lengthOfLongestSubstring("aab"));//3
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int c = 0, max = 0;
        for (int i = 0; i < s.length(); ) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                c = c + 1;
                i = c;
                if (max < set.size()) {
                    max = set.size();
                }
                set.clear();
            } else {
                set.add(ch);
                i++;
                if (max < set.size()) {
                    max = set.size();
                }
            }
        }
        return max;
    }

    private static void a2() {
        int nums[] = {3, 2, 3, 4}, target = 7;
        int a[] = twoSum(nums, target);
        for (int x : a) {
            System.out.println(x);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

//        for (int i = 0; i < nums.length; i++) {
//            map.put(i, nums[i]);
//        }
//
//        for (int key : map.keySet()) {
//            int val = target - map.get(key);
//
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }

//        Stack<Integer> st = new Stack<>();
//        for (int i = nums.length - 1; i >= 0; i--)
//            st.push(i);
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            int a = st.pop();
//            int b = st.pop();
//            if (nums[a] + nums[b] == target) {
//                return new int[]{a, b};
//            } else {
//                st.push(b);
//            }
//        }

        return new int[]{0};
    }

    private static void a1() {
        int a[] = {10, 20, 30, 40, 50};
        int l = 0, h = a.length - 1;
        int ub = -1, target = 30;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] > target) {
                ub = a[mid];
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ub);
    }
}
