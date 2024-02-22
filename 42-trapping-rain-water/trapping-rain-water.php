class Solution {

    /**
     * @param Integer[] $height
     * @return Integer
     */
    function trap($height) {
        $n = count($height);

        if ($n <= 2) {
            return 0; // No trapping possible with less than 3 elements
        }

        $leftMax = array_fill(0, $n, 0);
        $rightMax = array_fill(0, $n, 0);

        $leftMax[0] = $height[0];
        for ($i = 1; $i < $n; $i++) {
            $leftMax[$i] = max($leftMax[$i - 1], $height[$i]);
        }

        $rightMax[$n - 1] = $height[$n - 1];
        for ($i = $n - 2; $i >= 0; $i--) {
            $rightMax[$i] = max($rightMax[$i + 1], $height[$i]);
        }

        $trappedWater = 0;

        for ($i = 0; $i < $n; $i++) {
            $waterLevel = min($leftMax[$i], $rightMax[$i]);
            $trappedWater += max(0, $waterLevel - $height[$i]);
        }

        return $trappedWater;
    }
}
