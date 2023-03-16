class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for (int i=0; i < numbers.length; i++) {
           sum += numbers[i];
        }
        sum /= numbers.length;
        if (sum*10%5 == 0) return sum;
        return Math.floor(sum);
    }
}