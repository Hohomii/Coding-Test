class Solution {
    public int[] solution(String[] strlist) {
        int[] wordLength = new int[strlist.length];

        for(int i=0; i < strlist.length; i++) {
            wordLength[i] = strlist[i].length();
        }
        return wordLength;
    }
}