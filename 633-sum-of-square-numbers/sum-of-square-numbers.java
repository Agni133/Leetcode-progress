class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        long right = (long) Math.sqrt(c);  // Use long instead of int for right

        while (left <= right) {
            long sum = left * left + right * right;  // Use long for sum as well

            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
