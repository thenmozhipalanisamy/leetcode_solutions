class Solution {
    public int[] intersect(int[] nums1, int[] nums2){
        ArrayList<Integer> as=new ArrayList<>();
        for(int n1:nums1){
            as.add(n1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int n2:nums2){
            list.add(n2);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int n3:list){
        if(as.contains(n3)){
            ans.add(n3);
            as.remove((Integer)n3);
        }
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}