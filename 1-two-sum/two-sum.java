class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap <Integer,Integer> map = new HashMap<>();
      
        for(int i=0;i<nums.length;i++){
       
           int comp = target- nums[i];

           if(map.containsKey(comp)){
               
               return new int[]{map.get(comp),i};

           }

           map.put(nums[i],i);        

        }
        
       return new int[]{-1,-1};  // NO target found in the array 

    }
}