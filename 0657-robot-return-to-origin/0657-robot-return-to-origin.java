class Solution {
    public boolean judgeCircle(String moves) {
        int count = 0;
        int count2 = 0;
        for(int i = 0 ; i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                count++;
            }
            else if(moves.charAt(i)=='D'){
                count--;
            }
            else if(moves.charAt(i)=='R'){
                count2++;
            }
            else if(moves.charAt(i)=='L'){
                count2--;
            }                        
        }
        return (count==0&&count2==0);
    }
}