class Solution {
    public int solution(int hp) {
        int cnt = 0;
        
        cnt += (hp/5);
        hp = hp%5;
        
        cnt += (hp/3);
        cnt += hp%3;
        
        return cnt;
    }
}