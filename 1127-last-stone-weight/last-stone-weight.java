import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        while (n > 1) {
            Arrays.sort(stones, 0, n);  // Sort the array in ascending order
            int diff = stones[n - 1] - stones[n - 2];  // Calculate the difference between the two heaviest stones

            if (diff == 0) {
                n -= 2;  // Both stones are destroyed
            } else {
                stones[n - 2] = diff;  // Update the weight of the remaining stone
                n -= 1;  // One stone is destroyed
            }
        }

        return (n == 0) ? 0 : stones[0];
    }
}
