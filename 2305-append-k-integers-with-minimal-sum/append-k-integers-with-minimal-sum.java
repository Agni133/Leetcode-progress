class Solution {
    public long minimalKSum(int[] nums, int k) {
            long  sum=0;         
         for(int i=1;i<=k;i++){

             sum  +=i;   // first   k positive integer 
         }

          Arrays.sort(nums);

         for(int i=0;i<nums.length;i++){

              if(i!=0 &&  nums[i]==nums[i-1]){

                  continue;    // skip the dulpicate value 
              }
          
             if( nums[i]<=k){

                 sum-=nums[i];
                 k++;
                 sum+=k;   // increament the k 
             }else{

                 break;
             }  

         }

        return sum;       
    }
}