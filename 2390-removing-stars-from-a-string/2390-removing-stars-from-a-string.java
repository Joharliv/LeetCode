class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }

        for(char ch : st){
            str.append(ch);
        }

        return str.toString();
    }
}