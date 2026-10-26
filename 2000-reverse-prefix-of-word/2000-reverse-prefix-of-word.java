class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        String res= "";
        int j = 0;
        for(int i =0;i<word.length();i++){
            char c = word.charAt(i);
            if(c == ch){
              res+= c;
              j = i+1;
              while(!st.isEmpty()){
                res+= st.peek();
                st.pop();
              }
              break;
            } 
   
            st.push(c);
            
        }

        for(int k = j;k<word.length();k++){
            res+= word.charAt(k);
        }
        
        return res;
    }
}