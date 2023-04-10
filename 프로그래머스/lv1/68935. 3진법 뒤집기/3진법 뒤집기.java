// 3진법. n을 계속 3으로 나눈 나머지들.(n이 3보다 작을 때까지)
// 나머지숫자를 하나하나 빼야 함. ArrayList 사용. 그리고 마지막에 int로 만든다.
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        // 10진법 -> 3진법
        while (n != 0) {
            list.add(n % 3);
            n /= 3;
        }
        
        // 3진법 -> 10진법
        for (int i=0; i < list.size(); i++) {
            answer += (Math.pow(3, list.size()-i-1)*list.get(i));
        }
        return answer;
    }
}