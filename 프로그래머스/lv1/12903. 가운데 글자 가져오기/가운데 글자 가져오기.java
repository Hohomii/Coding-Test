class Solution {
    public String solution(String s) {
        if (s.length() % 2 == 1) {
                char answer = s.charAt(s.length() / 2);
                return Character.toString(answer);
            } else {
                return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
            }
    }
}