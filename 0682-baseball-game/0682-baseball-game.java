class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String s : operations){
            
            if(s.equals("C")){
                if(st.isEmpty()){
                    continue;
                }
                else{
                st.pop();
                }
            }
                
             else if(s.equals("D")){
                st.push(2*st.peek());
                
            }
            else if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
               st.push(Integer.parseInt(s));
            }
        }

        for(int s : st){
            sum+= s;
        }
        return sum;
    }
}