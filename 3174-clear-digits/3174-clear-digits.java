class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        for(char ch :st){
            res += ch;
        }

        return res;
    }
}