import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        // Initialize a hashmap to store the running count of difference between 0s and 1s
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initial state
        
        int maxLength = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is 0, decrease count by 1; otherwise, increase count by 1
            count += nums[i] == 0 ? -1 : 1;
            
            // If the count difference already exists in the map, update maxLength
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                // Otherwise, add the count difference to the map
                map.put(count, i);
            }
        }
        
        return maxLength;
    }
}
