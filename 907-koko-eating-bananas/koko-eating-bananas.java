  class Solution {
    public static boolean caneatall(int piles[],int mid , int h){
            int actualtime=0;  
        for(int pile:piles){
             actualtime+=pile/mid;

             if(pile%mid!=0){

                 actualtime++;
             }
         
        }

      return actualtime <=h;    // if this time exceeded the watchmen will catch kiko

    }

    public int minEatingSpeed(int[] piles, int h) {

       int l =1;

       int r= Integer.MAX_VALUE;

         while(l<r){

           int mid = l+ (r-l)/2;

            if(caneatall(piles,mid,h)){
                r=mid;

            } else{

                l= mid+1;
            } 
    

         }        
          
     return l;

    }
}