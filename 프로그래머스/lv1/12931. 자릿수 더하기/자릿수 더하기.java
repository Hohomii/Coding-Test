// 쪼갠 다음 sum
// 쪼개기 : string 으로 바꿔서 split 사용

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] numList = num.split("");
        for (int i=0; i < numList.length; i++) {
            answer += Integer.parseInt(numList[i]);
        }
        return answer;
    }
}