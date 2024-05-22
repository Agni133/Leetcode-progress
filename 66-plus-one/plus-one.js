/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
      
  let n = digits.length;

  for(let i=n-1;i>=0;i--){
       // if curr digit is at last
      if(digits[i]<9){
         
         digits[i]++;
         return digits;

      }
     
       digits[i]=0;

  }
            
      let result = new Array(n+1).fill(0);

      result[0]=1;

      return result;
    
    
};