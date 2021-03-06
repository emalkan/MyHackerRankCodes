/*Given a sorted integer array without duplicates, return the summary of its ranges.

Example 1:

Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
Example 2:

Input:  [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.

*/
//Code

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<String>();
        if(nums.length==0)
            return result;
    int start=nums[0];
    int end=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]== nums[i]-1){
              end=nums[i];
                
            }
               
            
            else{
                if(start==end)
                    result.add(String.valueOf(start));
                else
                    result.add(start+"->"+end);
                
               
                start=nums[i];
                end=nums[i];
                
            }
            
            
        }
        
                if(start==end)
                    result.add(String.valueOf(start));
                else
                    result.add(start+"->"+end);

        
        return result;
    }
   
    
    
}
