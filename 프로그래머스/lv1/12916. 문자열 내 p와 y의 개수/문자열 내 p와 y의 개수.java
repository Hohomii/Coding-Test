class Solution {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        boolean answer = false;
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                cntP++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                cntY++;
        }
        if (cntP == cntY) {
            answer = true;
        } 
        return answer;
    }
}