// 3개를 더했을 때 소수가 되는 경우의 수
// 012, 013, 123
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums); // 정렬하여 중복 계산을 피함.
        for (int i=0; i < nums.length-2; i++) {
            for (int j=i+1; j < nums.length-1; j++) {
                for (int k=j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
         return true;
    }
}