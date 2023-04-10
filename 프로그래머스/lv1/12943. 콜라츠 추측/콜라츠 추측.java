// 조건1. 짝수면 /2 ... 홀수면 *3+1
// 조건2. 그렇게 한 수가 1이 될 때까지 x회 반복. 1이 아니면 다시 반복문 타게. while문 쓰는 게 좋을 수도.
// 그 반복횟수 x는? // while문 + index 조합

class Solution {
    public int solution(int num) {
        long n = num;
        int index = 0;
        //주어진 수가 1인 경우
        if (n == 1) return 0;
        
        while (true) {
            if (n%2 == 0) {
                n = n/2;
            } else {
                n = n*3+1;
            }
            index++;
            // 반복횟수가 500번 초과하면 -1
            if (index > 500) return -1;
            
            if (n == 1)
                break;  
        }
        return index;
    }
}