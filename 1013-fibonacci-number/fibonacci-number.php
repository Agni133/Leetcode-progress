class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
    function fib($n) {
        
       if ($n == 1 || $n == 0) {
            return $n;
        }

        $fnm1 = $this->fib($n - 1);
        $fnm2 = $this->fib($n - 2);
        $fn = $fnm1 + $fnm2;

        return $fn;

    }
}