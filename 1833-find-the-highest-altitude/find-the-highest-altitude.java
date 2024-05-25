class Solution {
    public int largestAltitude(int[] gain) {
        // -5,1,5,0,-7
        // two trackers one is curr and highest 
        int currentalt=0;
        int highestalt=0;

        for(int i=0;i<gain.length;i++){
             currentalt+= gain[i];
          
              if(currentalt>highestalt){
                highestalt= currentalt;
              }

        }
        
        return highestalt;
    }
}