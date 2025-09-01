class Solution {
    public int differenceOfSums(int n, int m) {
        int divsum=0;
        int nondivsum=0;
        int ans=0;
        for(int i=0;i<=n;i++){
            if(i%m==0){
                divsum+=i;
            }
            else{
                nondivsum+=i;
            }
            ans = nondivsum-divsum;
        }
        return ans;
    }
}