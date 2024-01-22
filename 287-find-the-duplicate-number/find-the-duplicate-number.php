class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function findDuplicate($nums) {
      
    //    CONSIDER ARRAY AS A  LINKED LIST 
       $slow =0;   // TORTISE slow runs 1 step  BEHIND 
       $fast=0;    // HARE  FAST TRAVELS 2 STEPS AHEAD 
       do{
          $slow =$nums[$slow];
          $fast= $nums[$nums[$fast]];
       }while($fast!=$slow);
      
        // first  cycle run until the slow and fast meet each other
        // in next cycle when slow and fast meet move the slow pointer to the beginning 
        //  and run until they meet each other  thats the starting point and dulpicate
           
       $slow=0;

       while($slow!=$fast){
             
          $slow=$nums[$slow];
          $fast= $nums[$fast];
       }  

        return $slow;
    }
}