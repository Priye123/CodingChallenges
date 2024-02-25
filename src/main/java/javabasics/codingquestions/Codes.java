package javabasics.codingquestions;

public class Codes {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 2, 5};
        int maxSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i], j = i;
            while (nums[i + 1] - 1 == nums[i]) {
                sum += nums[i+1];
                if (i > nums.length) break;
                i++;
            }
            System.out.println(sum);
            if (sum > maxSum) {
                maxSum = sum;
            }
            i = j;
        }
        System.out.println(maxSum);
        // return maxSum;
    }
}

