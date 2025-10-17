class Solution {
    public int findPermutationDifference(String s, String t) {
        int count = 0;
        for (char c : s.toCharArray()) {
            int posS = s.indexOf(c);
            int posT = t.indexOf(c);
            count += Math.abs(posS - posT);
        }
        return count;
    }
}