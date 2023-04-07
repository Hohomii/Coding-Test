class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if (s.length() == 4 || s.length() == 6) {
            if (isStringInt(s)) {
                answer = true;
            }
        }
        return answer;
    }
    
    public static boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);  
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}