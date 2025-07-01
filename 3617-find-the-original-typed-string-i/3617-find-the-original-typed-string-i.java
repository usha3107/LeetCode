class Solution {
    public int possibleStringCount(String word) {
        int len = word.length();
        int count = len;
        for(int l =1;l<len;l++){
            if(word.charAt(l) != word.charAt(l-1)) count--;
        }
        return count;
    }
}