class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int[] freq=new int[10000];
	 for(int i=0;i<n;i++) {
		 freq[nums[i]]++;
	 }
	 int max=0;
	 int maxi=0;
	 for(int i=0;i<freq.length;i++) {
		 if(max<freq[i]) {
			 max=freq[i];
			 maxi=i;
		 }
	 }
     return maxi;
    }
}
       