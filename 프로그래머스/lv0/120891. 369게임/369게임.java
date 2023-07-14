//숫자를 잘라서 배열에 넣고, 3,6,9가 나올 때마다 1증가
import java.util.*;

class Solution {
    public int solution(int order) {
        ArrayList<Integer> arrOrder = new ArrayList<>();
        while(order > 0) {
            arrOrder.add(order%10);
            order /= 10;
        }
        
        int cnt = 0;
        for (int num : arrOrder) {
            if (num % 3 == 0 && num != 0) {
                cnt++;
            }
        }
        return cnt;
    }
}