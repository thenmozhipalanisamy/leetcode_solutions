class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> s1=new HashMap<>();
        Map<String,Integer> s2=new HashMap<>();
        for(String word:words1){
            s1.put(word,s1.getOrDefault(word,0)+1);
        }
        for(String word:words2){
            s2.put(word,s2.getOrDefault(word,0)+1);
        }
            int ans=0;
            for(String key:s1.keySet()){
            if(s1.get(key)==1 && s2.getOrDefault(key,0)==1){
                ans++;
            }
        }
        return ans;
    }
}