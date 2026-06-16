class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int []perm = new int[n+1];
        Stack<Integer> st = new Stack<>();
        int ind = 0;
        for(int i=0;i<=n;i++){
            st.push(i);
            if(i==n || s.charAt(i)=='I'){
                while(!st.isEmpty()){
                    perm[ind++]=st.pop();
                }
            }
        }
        return perm;
    }
}