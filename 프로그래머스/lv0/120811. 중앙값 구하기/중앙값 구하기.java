import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int center = array.length / 2; 
        return array[center];
    }
}