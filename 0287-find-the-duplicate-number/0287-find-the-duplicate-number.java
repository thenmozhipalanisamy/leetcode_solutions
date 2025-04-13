class Solution {
    public int findDuplicate(int[] nums) {
        int res=0;
        int[] freq=new int[1000000];
        for(int n:nums){
            freq[n]++;
        }
        int max=0;
        for(int i=0;i<1000000;i++){
            if(max<freq[i]){
                max=freq[i];
                res=i;
            }
        }
        return res;
    }
}