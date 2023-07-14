//조건 : n%6==0, 몫의 최소값
class Solution {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            if (answer*6%n == 0) break;
            answer++;
        }
        return answer;
    }
}