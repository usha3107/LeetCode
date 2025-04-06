class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char) ('a' + i),morse[i]);
        }
        Set<String> set=new HashSet<>();
        for(String word:words){
            StringBuilder str=new StringBuilder();
            for(int i=0;i<word.length();i++){
                str.append(map.get(word.charAt(i)));
            }
            set.add(str.toString());
        }
        return set.size();
    }
}