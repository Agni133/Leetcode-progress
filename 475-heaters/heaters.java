class Solution {
    public int findRadius(int[] houses, int[] heaters) {

Arrays.sort(heaters);
        int maxRadius = 0;

        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);

            if (index < 0) {
                index = -(index + 1);
            }

            int leftDistance;
            int rightDistance;

            if (index > 0) {
                leftDistance = house - heaters[index - 1];
            } else {
                leftDistance = Integer.MAX_VALUE;
            }

            if (index < heaters.length) {
                rightDistance = heaters[index] - house;
            } else {
                rightDistance = Integer.MAX_VALUE;
            }

            maxRadius = Math.max(maxRadius, Math.min(leftDistance, rightDistance));
        }

        return maxRadius;

    }
}