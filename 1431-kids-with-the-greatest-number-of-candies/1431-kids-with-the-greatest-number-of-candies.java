class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = -1;
        for(int i : candies){
           max = Math.max(max , i);
        }

        for(int i : candies){
            int total = i+extraCandies;
            if(total>= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}