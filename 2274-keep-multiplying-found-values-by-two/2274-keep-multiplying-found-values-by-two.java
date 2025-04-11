class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        int i;
        for( i=0;i<n;i++){
            if(nums[i]==original||nums[0]==original){
                 original=original*2;
                 i=0;
            }
        }
        return original;
            
       
    }
}