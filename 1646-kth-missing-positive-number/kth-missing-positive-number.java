class Solution {
    public int findKthPositive(int[] arr, int k) {
        
         int n= arr.length;

         for(int i=0;i<arr.length;i++){

                  int nums= arr[i];

                  if(nums<=k){

                      k++;
                  }else{

                      break;
                  }

         }
       
            
      return k;
        
    }
}