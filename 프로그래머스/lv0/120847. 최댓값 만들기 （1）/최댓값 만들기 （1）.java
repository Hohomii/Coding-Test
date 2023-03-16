import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int maxNum1 = numbers[numbers.length - 1];
        int maxNum2 = numbers[numbers.length - 2];
        return maxNum1 * maxNum2;
    }
}