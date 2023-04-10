// int x * x = n 이면 x가 정수 제곱근!
// '양의 정수'라는 조건을 어떻게 걸어줄 수 있지? Math.sqrt(n)을 알아도 조건 거는 법을 모르니..
// 양의 정수 제곱근을 갖는 수는 4부터다. 
// 반복문을 돌려야 하나?

import java.util.*;
class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        if (Math.pow(x,2)==n) {
            return (long)Math.pow(x+1, 2);
        } else return -1;
    }
}