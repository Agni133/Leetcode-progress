class Solution {
    public int maxScore(String s) {
        // left side and right side split the string 
         int leftside=0;
         int rightside=0;
         int maxscore=0;
         for(char c : s.toCharArray()){
            if(c=='1')
             rightside++;

         }

         for(int i=0; i<s.length()-1;i++){
             
             char c= s.charAt(i);

             if(c=='0')
             leftside++;
             else
             rightside--;
            

            maxscore = Math.max(maxscore,leftside+rightside);
         }
          
          return maxscore;
    }
}