class Solution {
    public int[] sortedSquares(int[] nums) {
        int pow=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             pow=(int)Math.pow(nums[i],2);
             arr[i]=pow;
        }
        Arrays.sort(arr);
        return arr;
    }
}