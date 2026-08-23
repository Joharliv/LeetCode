class Solution {
    public boolean sumGame(String num) {
        int ls = 0;
        int rs = 0;
        int lq = 0;
        int rq = 0;

       
        for(int i =0;i<num.length()/2;i++){
            if(num.charAt(i) == '?') lq++;
            else ls += num.charAt(i) - '0';
        }

        for(int i =num.length()/2;i<num.length();i++){
            if(num.charAt(i) == '?') rq++;
            else rs += num.charAt(i) - '0';
        }

        int sumDiff = ls - rs;
        int QDiff = lq - rq;

        if(QDiff == 0){
            if(sumDiff == 0){
                return false;
            }else{
                return true;
            }
        }

       else if((lq + rq) %2 != 0){
        return true;
       }

        else{
            int maxDiff = -9*QDiff/2;
            if(sumDiff == maxDiff){
                return false;
            }
            else{
                return true;
            }
        }
    }
}