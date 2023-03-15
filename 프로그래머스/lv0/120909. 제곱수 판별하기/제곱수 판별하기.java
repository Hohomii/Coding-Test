class Solution {
    public int solution(int n) {
        int root = (int)Math.sqrt(n);
        if (n == root*root) return 1;
        else return 2;
    }
}