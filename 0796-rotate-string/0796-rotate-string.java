class Solution {
    public boolean rotateString(String s, String goal) {
        String res = s + s;
        if (goal.length() != s.length()){
            return false;
        }
        return res.contains(goal) ? true : false;
    }
}