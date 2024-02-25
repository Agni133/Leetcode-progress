class Solution {
    public int thirdMax(int[] nums) {
        long firstmax = Long.MIN_VALUE;
        long secmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num >= firstmax) {
                if (num > firstmax) {
                    thirdmax = secmax;
                    secmax = firstmax;
                    firstmax = num;
                }
            } else if (num >= secmax) {
                if (num > secmax) {
                    thirdmax = secmax;
                    secmax = num;
                }
            } else if (num > thirdmax) {
                thirdmax = num;
            }
        }

        return thirdmax == Long.MIN_VALUE ? (int)firstmax : (int)thirdmax;
    }
}
