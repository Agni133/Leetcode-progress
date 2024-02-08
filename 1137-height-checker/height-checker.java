import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Create a copy of the heights array to compare with the sorted version
        int[] expected = Arrays.copyOf(heights, heights.length);
        
        // Sort the expected array
        Arrays.sort(expected);
        
        int count = 0;
        
        // Compare each element in the original heights array with the expected array
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
