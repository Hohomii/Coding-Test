class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
            for (int i = 0; i < my_string.length(); i++) {
                char oneStr = my_string.charAt(i);
                answer += Character.toString(oneStr).repeat(n);
            }
            return answer;
    }
}