class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        // if(nums.length<3) return nums[nums.length-1];

        HashSet<Integer> s = new HashSet<>();
        
        for(int i=nums.length-1;i>=0;i--){
            s.add(nums[i]);
            if(s.size()==3) return nums[i];

        }
        return nums[nums.length-1];
    }
}
