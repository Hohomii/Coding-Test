import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
            Arrays.sort(numbers);

            int mulNum1 = numbers[0] * numbers[1];
            int mulNum2 = numbers[numbers.length-1] * numbers[numbers.length-2];
            
            if (mulNum1 > mulNum2) return mulNum1;
            else return mulNum2;
    }
}