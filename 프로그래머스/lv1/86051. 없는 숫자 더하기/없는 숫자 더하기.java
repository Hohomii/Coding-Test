class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int numbersSum = 0;
        for (int i=0; i < 10; i++) {
            sum += i;
        }
        for (int j=0; j < numbers.length; j++) {
            numbersSum += numbers[j];
        }
        return sum - numbersSum;
    }
}