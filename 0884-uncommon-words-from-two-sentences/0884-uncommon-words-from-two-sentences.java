class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String , Integer> map = new HashMap<>();

        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");
       ArrayList<String> ans = new ArrayList<>();


        for(int i =0;i<w1.length;i++){
            map.put(w1[i] , map.getOrDefault(w1[i], 0)+1);
        }

        for(int i =0;i<w2.length;i++){
            map.put(w2[i] , map.getOrDefault(w2[i], 0)+1);
        }
        
        for(String res : map.keySet()){
            if(map.get(res) == 1){
                ans.add(res);
            }
        }
        
        return ans.toArray(new String[0]);
       
    }
}