class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }

            int target = -nums[i];
            Map<Integer, Integer> numMap = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];

                if (numMap.containsKey(complement)) {
                    result.add(Arrays.asList(nums[i], complement, nums[j]));

                    while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                        j++; // Skip duplicates
                    }
                }

                numMap.put(nums[j], j);
            }
        }

        return result;
    }
}