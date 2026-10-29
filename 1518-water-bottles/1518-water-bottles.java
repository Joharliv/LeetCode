class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        while(numBottles != 1  && numBottles >= numExchange){
            int empty = numBottles%numExchange; //15%4 = 3
            int full = numBottles/numExchange; //15/4 = 3

            
            res += full;
            
            numBottles = empty + full;
        }
        return res;
    }
}