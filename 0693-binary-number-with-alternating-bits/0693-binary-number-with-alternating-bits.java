class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        if (binary.contains("00")){
            return false;
        }
        if (binary.contains("11")){
            return false;
        }
        return true;
    }
}