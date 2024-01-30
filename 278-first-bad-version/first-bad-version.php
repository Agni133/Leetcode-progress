/* The isBadVersion API is defined in the parent class VersionControl.
      public function isBadVersion($version){} */

class Solution extends VersionControl {
    /**
     * @param Integer $n
     * @return Integer
     */
    function firstBadVersion($n) {
        
       $start= 1;
       $end=$n;
      
        while($start<$end){
          
          $mid =  floor($start+($end-$start)/2);

           if($this->isBadVersion($mid)){
                $end=$mid;

           }else{

               $start= $mid+1;
           }
         
 

        }
  

      return $start;        
    }
}