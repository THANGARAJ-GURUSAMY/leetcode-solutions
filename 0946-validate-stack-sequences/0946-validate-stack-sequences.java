class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        Stack<Integer> st=new Stack<>();
        for(int t:pushed)
        {
            st.push(t);
            while(!st.isEmpty()&&st.peek()==popped[j])
            {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}