class Solution {
    public String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();
            for(int i=1; i*code <= cipher.length(); i++) {
                result.append(cipher.charAt(code * i - 1));
            }
            return result.toString();
    }
}