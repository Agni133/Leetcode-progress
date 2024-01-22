import java.util.*;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {
                // If the sum is less than the target, increment count and move the left pointer.
                count += (right - left);
                left++;
            } else {
                // If the sum is greater than or equal to the target, move the right pointer.
                right--;
            }
        }

        return count;
    }
}

