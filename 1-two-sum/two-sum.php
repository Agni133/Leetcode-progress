class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) {
        $result = array(0, 0);

    $length = count($nums);

    for ($i = 0; $i < $length; $i++) {
        for ($j = $i + 1; $j < $length; $j++) {
            if ($nums[$i] + $nums[$j] == $target) {
                $result[0] = $i;
                $result[1] = $j;
                
            }
        }
    }

    // Return an array with -1 if no solution is found
    return $result;

    }
}