class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for(int i = 0;i<s.size();i++){
            if(s[i]== '('|| s[i]== '['|| s[i]=='{'){  //opening brackets
                st.push(s[i]);
            }
            else{    // closing brackets
               if(st.empty()){    //closing > opening
                return false;
               }
               else{
                if(st.top()== '(' && s[i]== ')'||
                   st.top()== '[' && s[i]== ']'||
                   st.top()== '{' && s[i]== '}'){  //if they match
                    st.pop();  
                   }
                else{                   // if do no match
                    return false;
                }
               }
            }
        }

        return st.empty(); // opening > closing
    }
};