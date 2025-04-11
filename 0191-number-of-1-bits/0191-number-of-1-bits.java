class Solution {
    public int hammingWeight(int n) {
        String binary=Integer.toBinaryString(n);
       // char[] ch=binary.toCharArray();
        int[] freq=new int[2];

        for(char ch:binary.toCharArray() ){
            freq[ch-'0']++;
        }
        return freq[1];
    }
}