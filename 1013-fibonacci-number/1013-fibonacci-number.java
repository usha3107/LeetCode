class Solution {
    public int fib(int n) {
        int prev = 0;
        int curr = 1;
        while(n > 0){
            int next = prev + curr;
            prev = curr;
            curr = next;
            n--;
        }
        return prev;
    }
}