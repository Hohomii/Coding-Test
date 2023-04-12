// 자기 자신으로만 나누어진다 = 자기 자신이 아닌 수로는 나눴을 때 무조건 나머지 생김
// n보다 작거나 같은 범위 내에 있는 소수
// 나눴을 때 나머지가 0인 수가 1개인 수를 찾으면 된다.
// ***
// while (n보다 작거나 같다)
// if (n%index==0)
// cnt++;
// idx++;
// if (cnt == 1)  => 1과 자기자신
// return answer
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i=2; i <= n; i++) {
            boolean isPrime = true;
            for (int j=2; j*j <= i; j++) {
                if (i%j == 0) {
                isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                answer++;
            }
        }
        return answer;
    }
}