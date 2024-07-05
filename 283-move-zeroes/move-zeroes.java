
class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        // Push non-zero elements onto the stack
        for (int num : nums) {
            if (num != 0) {
                stack.push(num);
            }
        }

        // Reconstruct the array with non-zero elements first
        int index = 0;
        while (!stack.isEmpty()) {
            nums[index++] = stack.remove(0); // Use remove(0) to maintain the original order
        }

        // Fill the remaining part of the array with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
    }