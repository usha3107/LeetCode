class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
        for(char c:s.toCharArray()){
            sum+=(123-c)*i++;
        }
        return sum;
    }
}