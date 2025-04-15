class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastoccur = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            lastoccur.put(current,i);
        }
        List<Integer> as=new ArrayList<>();
        int start=0;int end=0;
        for(int i=0;i<s.length();i++){
             end=Math.max(end,lastoccur.get((s.charAt(i))));
           if(i==end){
             as.add(end-start+1);
             start=i+1;
           }
          // return as;
        }
         return as;
    }
}
    
        