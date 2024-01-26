class Solution {
    public int missingNumber(int[] nums) {
             
             int n = nums.length;
              int totalsum= n*(n+1)/2; // excepted sum 
             
             for(int i=0;i<n;i++){
              
             totalsum -= nums[i];

             }

       return totalsum;
    }
}