class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        ArrayList<Integer> as=new ArrayList<Integer>();
        for(int a:nums){
            if(a%2==0){
                as.add(a);
            }
        }
        for(int b:nums){
            if(b%2!=0){
                as.add(b);
            }
        }
        for(int i=0;i<as.size();i++){
            arr[i]=as.get(i);
        }
        return arr;
    }
}