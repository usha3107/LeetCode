class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int [] indicies = new int[count(binary,'1')];
        int index=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                indicies[index]=i;
                index++;
            }
        }
        int dis=0;
        for (int i=0;i<indicies.length-1;i++){
            if (indicies[i+1]-indicies[i]>dis){
                dis =indicies[i+1]-indicies[i];
            }
        }
        return dis;
    }
    public int count(String str,char value){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==value){
                count++;
            }
        }
        return count;
    }
}