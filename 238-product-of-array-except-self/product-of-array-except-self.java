
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int leftProduct = 1;  // tracking the value of the product left side
        int rightProduct = 1;// tracking the value of the product right side     
        int[] result = new int[numsLength];                           
        for(int i = 0; i < numsLength; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];         
        }
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
}