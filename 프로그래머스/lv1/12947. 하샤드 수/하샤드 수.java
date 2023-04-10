// 자릿수의 합을 구한다.
// x를 자릿수의 합으로 나눴을 때 나머지가 0이어야 한다.
// 그러한 x를 구하라.


class Solution {
    public boolean solution(int x) {
        boolean flag = false;
        int num = 0;
        String s = Integer.toString(x);
        for(int i=0; i < s.length(); i++) {
            num += x % 10;
            x = x / 10;
        }
        if (Integer.parseInt(s) % num == 0) {
            flag = true;
        }
        return flag;
    }
}