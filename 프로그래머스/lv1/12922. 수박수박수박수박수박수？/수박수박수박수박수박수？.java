// n=홀수: 수박이 n/2만큼 + 수
// n=짝수: 수박이 n/2만큼
// 반복문 + 조건문 
// 문자열을 n번 반복하는 법? => str.repeat(n)

class Solution {
    public String solution(int n) {
        String answer = "";
        String word = "수박";
        if (n == 1) {
            answer = "수";
        } else if (n%2 ==0) {  
            answer = word.repeat(n/2);
        } else {
            answer = word.repeat(n/2) + "수";
        }
        return answer;
    }
}