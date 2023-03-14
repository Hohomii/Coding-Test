class Solution {
    public int[] solution(int money) {
        int n = 0;
        int changes = 0;
        n = (money - changes) / 5500;
        changes = money - (5500*n);
        int[] answer = {n,changes};
        return answer;
    }
}