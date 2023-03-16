class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        double average = 0;
        
        for (int i=0; i < numbers.length; i++) {
           sum += numbers[i];
        }
        
        average = sum / numbers.length;
        if (average*10%5 == 0) return average;
        return Math.floor(average);
    }
}