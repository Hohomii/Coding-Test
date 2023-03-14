class Solution {
    public int solution(int n, int k) {
        int lamp = n*12000;
        int drink = k*2000;
        if (n >= 10) {
            int count = (int)Math.floor((double)n/10);
            drink = drink - (count*2000);
        }
        int answer = lamp + drink;
        return answer;
    }
}