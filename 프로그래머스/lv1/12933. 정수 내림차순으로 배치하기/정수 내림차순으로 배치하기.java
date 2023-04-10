import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        char[] chars = num.toCharArray();
        Arrays.sort(chars);
        num = new StringBuilder(new String(chars)).reverse().toString();
        answer = Long.parseLong(num);
        return answer;
    }
}